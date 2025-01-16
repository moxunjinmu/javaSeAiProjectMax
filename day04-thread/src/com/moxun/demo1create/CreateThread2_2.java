package com.moxun.demo1create;

public class CreateThread2_2 {
    public static void main(String[] args) {
//        创建多线程方式二：实现Runnable接口创建线程
//        4、把线程任务对象交给一个线程对象来处理
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("MyRunnable");
            }
            System.out.println("MyRunnable");
        }).start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main");
        }
    }
}