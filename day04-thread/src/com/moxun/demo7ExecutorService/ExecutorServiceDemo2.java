package com.moxun.demo7ExecutorService;

import java.util.concurrent.*;

public class ExecutorServiceDemo2 {
    public static void main(String[] args) {
//        目标：创建线程池对象来使用
//        1、使用线程池的实现类ThreadPoolExecutor声明七个参数来创建线程池对象。
        ExecutorService pool = new ThreadPoolExecutor(3,5,5, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(3), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());


        MyCallable mc = new MyCallable(100);
        MyCallable mc2 = new MyCallable(200);
        MyCallable mc3 = new MyCallable(300);
        MyCallable mc4 = new MyCallable(400);
        try{
            Future<String> sub1 = pool.submit(mc);
            Future<String> sub2 = pool.submit(mc2);
            Future<String> sub3 = pool.submit(mc3);
            Future<String> sub4 = pool.submit(mc4);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
