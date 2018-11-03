package org.hx.springboot.multidb.pool;

public interface Pool<T> {

    T get();

    void release(T t);

    void shutdown();

    interface Validator<T> {
        boolean isValid(T t);

        void invalidate(T t);
    }
}
