package org.hx.ian.springboot.multidb.config.dynamicproxy;

import java.lang.annotation.*;

/**
 * @ClassName OtherSource
 * @Author hx 2018/11/5
 * @Description 其他数据源注解
 * @Date 2018/11/5 17:16
 * @Version 1.0
 */
@Documented
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface OtherSource {
    String value();
}
