package org.hx.ian.core.pool;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName BlockingPool
 * @Author hx 2018/11/5
 * @Description 阻塞式对象池接口
 * @Date 2018/11/5 16:18
 * @Version 1.0
 */
public interface BlockingPool<T> extends Pool<T> {

    /**
     * 获取对象
     *
     * @return
     */
    @Override
    T get();

    /**
     * 获取对象，若超时，则返回null
     *
     * @param timeout
     * @param timeUnit
     * @return
     * @throws InterruptedException
     */
    T get(long timeout, TimeUnit timeUnit) throws InterruptedException;
}
