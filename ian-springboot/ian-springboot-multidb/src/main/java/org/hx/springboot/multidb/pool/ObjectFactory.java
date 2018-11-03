package org.hx.springboot.multidb.pool;

public interface ObjectFactory<T> {

    T createNew();
}
