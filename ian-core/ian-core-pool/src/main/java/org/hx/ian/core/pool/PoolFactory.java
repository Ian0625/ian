package org.hx.ian.core.pool;

/**
 * @ClassName PoolFactory
 * @Author hx 2018/11/5
 * @Description 对象工厂
 * @Date 2018/11/5 16:35
 * @Version 1.0
 */
public final class PoolFactory {

    private PoolFactory() {

    }

    /**
     * 获取非阻塞式对象池
     *
     * @param size
     * @param factory
     * @param validator
     * @param <T>
     * @return
     */
    public static <T> Pool<T> newBoundedBlockingPool(int size, ObjectFactory<T> factory, Pool.Validator<T> validator) {
        return new BoundedBlockingPool<>(size, validator, factory);
    }

    /**
     * 获取阻塞式对象池
     *
     * @param size
     * @param factory
     * @param validator
     * @param <T>
     * @return
     */
    public static <T> Pool<T> newBoundedNonBlockingPool(int size, ObjectFactory<T> factory, Pool.Validator<T>
            validator) {
        return new BoundedPool<>(size, validator, factory);
    }
}
