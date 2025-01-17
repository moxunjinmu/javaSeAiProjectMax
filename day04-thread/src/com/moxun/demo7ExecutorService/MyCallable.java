package com.moxun.demo7ExecutorService;

import java.util.concurrent.Callable;

//1、定义一个实现类实现Callable接口
public class MyCallable implements Callable<String> {
    private int n;
    public MyCallable(int n) {
        this.n = n;
    }
    //2、实现call方法，定义线程执行体
    @Override
    public String call() throws Exception {
        int num = 0;
        for (int i = 0; i < n; i++) {
            num += i;
            System.out.println("子线程执行中...");
        }

        return "子线程计算"+ n + "的和为：" + num;
    }
}
