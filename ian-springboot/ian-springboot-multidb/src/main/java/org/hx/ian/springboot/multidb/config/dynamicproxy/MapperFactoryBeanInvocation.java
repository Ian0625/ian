package org.hx.ian.springboot.multidb.config.dynamicproxy;

import org.mybatis.spring.mapper.MapperFactoryBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName MapperFactoryBeanInvocation
 * @Author hx 2018/11/5
 * @Description Mapper 工厂 代理，实现动态数据源切换
 * @Date 2018/11/5 17:19
 * @Version 1.0
 */
public class MapperFactoryBeanInvocation<T> extends MapperFactoryBean<T> implements InvocationHandler {

    public MapperFactoryBeanInvocation() {
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
