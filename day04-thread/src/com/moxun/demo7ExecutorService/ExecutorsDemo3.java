package com.moxun.demo7ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorsDemo3 {
    public static void main(String[] args) {
//        目标：通过线程池工具类：Executors,调用其静态方法直接得到线程池
        ExecutorService pool = Executors.newFixedThreadPool(3);
        ExecutorService pool1 = Executors.newCachedThreadPool();

        MyCallable mc1 = new MyCallable(100);
        MyCallable mc2 = new MyCallable(200);
        MyCallable mc3 = new MyCallable(300);
        MyCallable mc4 = new MyCallable(400);
        try{
            Future<String> sub1 = pool.submit(mc1);
            Future<String> sub2 = pool.submit(mc2);
            Future<String> sub3 = pool.submit(mc3);
            Future<String> sub4 = pool.submit(mc4);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
