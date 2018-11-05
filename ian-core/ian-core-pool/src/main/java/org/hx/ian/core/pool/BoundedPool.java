package org.hx.ian.core.pool;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

/**
 * @ClassName BoundedPool
 * @Author hx 2018/11/5
 * @Description 对象池具体实现类（非阻塞式）
 * @Date 2018/11/5 16:27
 * @Version 1.0
 */
public class BoundedPool<T> extends AbstractPool<T> {

    private int size;
    private Queue<T> objects;
    private Validator<T> validator;
    private ObjectFactory<T> objectFactory;
    private Semaphore permits;
    private volatile boolean shutdownCalled;

    public BoundedPool(int size, Validator<T> validator, ObjectFactory<T> objectFactory) {
        super();
        this.size = size;
        this.validator = validator;
        this.objectFactory = objectFactory;
        objects = new LinkedList<>();
        initializeObjects();
        shutdownCalled = false;
        permits = new Semaphore(size);
    }

    @Override
    public T get() {
        T t = null;
        if (!shutdownCalled) {
            if (permits.tryAcquire()) {
                t = objects.poll();
            }
        } else {
            throw new IllegalStateException("Object pool already shutdown");
        }
        return t;
    }

    @Override
    public void shutdown() {
        shutdownCalled = true;
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
        boolean added = objects.add(t);
        if (added) {
            permits.release();
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
     * 初始化对象池内置的对象队列
     */
    private void initializeObjects() {
        for (int i = 0; i < size; i++) {
            objects.add(objectFactory.createNew());
        }
    }

}
