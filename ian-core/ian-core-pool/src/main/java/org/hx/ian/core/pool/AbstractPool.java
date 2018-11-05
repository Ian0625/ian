package org.hx.ian.core.pool;

/**
 * @ClassName AbstractPool
 * @Author hx 2018/11/5
 * @Description 对象池抽象类
 * @Date 2018/11/5 16:14
 * @Version 1.0
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

    /**
     * 处理失效对象返回对象池
     *
     * @param t
     */
    protected abstract void handleInvalidReturn(T t);

    /**
     * 返回对象池
     *
     * @param t
     */
    protected abstract void returnToPool(T t);

    /**
     * 判断对象是否无效
     * <p>若对象无效，则返回true，否则返回false</p>
     *
     * @param t
     * @return
     */
    protected abstract boolean isValid(T t);
}