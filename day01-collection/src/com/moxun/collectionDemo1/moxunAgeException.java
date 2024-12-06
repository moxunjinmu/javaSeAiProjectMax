package com.moxun.collectionDemo1;

/**
 * 自定义编译时异常
 * 1. 继承RuntimeException类
 * 2. 构造方法中调用父类的构造方法
 * 3. 项目中哪里需要抛出该异常，就throw
 * */
public class moxunAgeException extends RuntimeException {
    public moxunAgeException() {}

    public moxunAgeException(String  message) {
        super(message);
    }
}
