package org.hx.ian.core.pool;

import java.util.concurrent.*;

/**
 * @ClassName BoundedBlockingPool
 * @Author hx 2018/11/5
 * @Description 阻塞式对象池实现类
 * @Date 2018/11/5 16:20
 * @Version 1.0
 */
public class BoundedBlockingPool<T> extends AbstractPool<T> implements BlockingPool<T> {

    private int size;
    private BlockingQueue<T> objects;
    private Validator<T> validator;
    private ObjectFactory<T> objectFactory;
    private ExecutorService executor = Executors.newCachedThreadPool();
    private volatile boolean shutdownCalled;

    public BoundedBlockingPool(int size, Validator<T> validator, ObjectFactory<T> objectFactory) {
        super();
        this.size = size;
        this.validator = validator;
        this.objectFactory = objectFactory;
        objects = new LinkedBlockingDeque<>();
        initializeObjects();
        shutdownCalled = false;
    }

    /**
     * 初始化对象池内置阻塞队列
     */
    private void initializeObjects() {
        for (int i = 0; i < size; i++) {
            objects.add(objectFactory.createNew());
        }
    }

    @Override
    public T get(long timeout, TimeUnit timeUnit) throws InterruptedException {
        if (!shutdownCalled) {
            T t = null;
            try {
                t = objects.poll(timeout, timeUnit);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return t;
        }
        throw new IllegalStateException("Object pool is already shutdown");
    }

    @Override
    public T get() {
        if (!shutdownCalled) {
            T t = null;
            try {
                t = objects.take();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return t;
        }
        throw new IllegalStateException("Object pool is already shutdown");
    }

    @Override
    public void shutdown() {
        shutdownCalled = true;
        executor.shutdownNow();
        clearResources();
    }

    /**
     * 清理资源
     */
    private void clearResources() {
        for (T t : objects) {
            validator.invalidate(t);
        }
    }

    @Override
    protected void returnToPool(T t) {
        if (validator.isValid(t)) {
            executor.submit(new ObjectReturner(objects, t));
        }
    }

    @Override
    protected void handleInvalidReturn(T t) {
        t = objectFactory.createNew();
        returnToPool(t);
    }

    @Override
    protected boolean isValid(T t) {
        return validator.isValid(t);
    }

    /**
     * 对象返回器
     * <p>开多线程向对象池还对象</p>
     *
     * @param <E>
     */
    private class ObjectReturner<E> implements Callable<Void> {

        private BlockingQueue<E> queue;
        private E e;

        public ObjectReturner(BlockingQueue<E> queue, E e) {
            this.queue = queue;
            this.e = e;
        }

        @Override
        public Void call() throws Exception {
            while (true) {
                try {
                    queue.put(e);
                    break;
                } catch (InterruptedException ie) {
                    Thread.currentThread().interrupt();
                }
            }
            return null;
        }
    }
}
