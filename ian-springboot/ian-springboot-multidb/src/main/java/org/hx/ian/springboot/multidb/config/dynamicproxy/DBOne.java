package org.hx.ian.springboot.multidb.config.dynamicproxy;

import java.lang.annotation.*;

/**
 * @ClassName DBOne
 * @Author hx 2018/11/5
 * @Description DB1的注解
 * @Date 2018/11/5 17:15
 * @Version 1.0
 */
@Documented
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface DBOne {
}
