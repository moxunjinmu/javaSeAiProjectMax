package com.moxun.demo7ExecutorService;

import java.util.concurrent.*;

public class ExecutorServiceDemo1 {
    public static void main(String[] args) {
//        目标：创建线程池对象来使用
//        1、使用线程池的实现类ThreadPoolExecutor声明七个参数来创建线程池对象。
        ExecutorService pool = new ThreadPoolExecutor(3,5,5, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(3), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

//        2.使用线程池处理任务！看会不会复用
        MyRunnable mr = new MyRunnable();
        pool.execute(mr); // 提交第1个任务创建第1个线程自动启动线程处理这个
        pool.execute(mr); // 提交第2个任务创建第2个线程自动启动线程处理这个
        pool.execute(mr); // 提交第2个任务创建第3个线程自动肩动线程处理这个

        pool.execute(mr); //复用线程
        pool.execute(mr); //复用线程

        pool.execute(mr); // 复用线程
        pool.execute(mr); // 到了创建临时线程的时机 会随机挑一个没有执行的任务跑，
        pool.execute(mr); // 临时线程
        pool.execute(mr); // 核心线程，临时线程都在忙，任务队列已满，到了任务拒绝策略，抛出异常

//        3.关闭线程池： 一般不关闭，除非是程序执行完毕
        pool.shutdown(); // 关闭线程池，不再接受新任务，但是会将队列中的任务执行完毕
//        pool.shutdownNow(); // 关闭线程池，不再接受新任务，并且会中断正在执行的任务

//       什么时候创建临时线程？ 四个条件 1.有定义临时线程的名额 2.核心线程都在工作 3.任务队列满员 4.有新任务尝试加入任务队列

    }
}
