package org.hx.springboot.multidb.pool;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

/**
 * @author hx 2018/10/31
 * @desc
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

    }

    @Override
    protected boolean isValid(T t) {
        return validator.isValid(t);
    }

    private void initializeObjects() {
        for (int i = 0; i < size; i++) {
            objects.add(objectFactory.createNew());
        }
    }

}
