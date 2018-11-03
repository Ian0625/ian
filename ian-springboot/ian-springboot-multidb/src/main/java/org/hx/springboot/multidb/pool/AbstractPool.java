package org.hx.springboot.multidb.pool;

/**
 * @author hx 2018/10/31
 * @desc
 */
public abstract class AbstractPool<T> implements Pool<T> {

    @Override
    public void release(T t) {
        if (isValid(t)) {
            returnToPool(t);
        } else {
            handleInvalidReturn(t);
        }
    }

    protected abstract void handleInvalidReturn(T t);

    protected abstract void returnToPool(T t);

    protected abstract boolean isValid(T t);
}
