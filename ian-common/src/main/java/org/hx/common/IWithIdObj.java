package org.hx.common;

/**
 * @ClassName IWithIdObj
 * @Author hx 2018/11/1
 * @Description 带有ID和value的接口
 * @Date 2018/11/1 17:14
 * @Version 1.0
 */
public interface IWithIdObj<K extends Number, V> {

    K getId();

    V getValue();
}
