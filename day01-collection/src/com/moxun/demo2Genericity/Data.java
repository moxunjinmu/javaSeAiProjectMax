package com.moxun.demo2Genericity;

public interface Data<T> {
    void add(T t);

    void remove(T t);
    void update(T t);

    T query(int id);
}
