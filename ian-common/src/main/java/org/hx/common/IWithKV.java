package org.hx.common;

/**
 * @ClassName IWithKV
 * @Author hx 2018/11/1
 * @Description KV 通用接口
 * @Date 2018/11/1 17:02
 * @Version 1.0
 */
public interface IWithKV<K, V> {

    K getKey();

    V getValue();
}
