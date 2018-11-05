package org.hx.ian.core.pool;

/**
 * @ClassName Pool
 * @Author hx 2018/11/5
 * @Description 对象池接口
 * @Date 2018/11/5 16:11
 * @Version 1.0
 */
public interface Pool<T> {

    /**
     * 获取对象
     *
     * @return
     */
    T get();

    /**
     * 释放对象
     *
     * @param t
     */
    void release(T t);

    /**
     * 关闭对象池，并释放资源
     */
    void shutdown();

    /**
     * 验证器
     *
     * @param <T>
     */
    interface Validator<T> {

        /**
         * 判断对象是否无效
         * <p>若对象无效，则返回true，否则返回false</p>
         *
         * @param t
         * @return
         */
        boolean isValid(T t);

        /**
         * 设置对象为无效对象
         *
         * @param t
         */
        void invalidate(T t);
    }

}
