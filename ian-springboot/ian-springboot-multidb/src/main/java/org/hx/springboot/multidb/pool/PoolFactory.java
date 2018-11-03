package org.hx.springboot.multidb.pool;

/**
 * @author hx 2018/10/31
 * @desc
 */
public final class PoolFactory {

    private PoolFactory() {

    }

    public static <T> Pool<T> newBoundedBlockingPool(int size, ObjectFactory<T> factory, Pool.Validator<T> validator){
        return new BoundedBlockingPool<>(size, validator, factory);
    }

    public static <T> Pool<T> newBoundedNonBlockingPool(int size, ObjectFactory<T> factory, Pool.Validator<T> validator) {
        return new BoundedPool<>(size, validator, factory);
    }
}
