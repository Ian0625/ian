package org.hx.ian.core.pool;

/**
 * @ClassName ObjectFactory
 * @Author hx 2018/11/5
 * @Description 对象工厂
 * @Date 2018/11/5 16:11
 * @Version 1.0
 */
public interface ObjectFactory<T> {

    /**
     * 创建新的对象
     *
     * @return
     */
    T createNew();
}
