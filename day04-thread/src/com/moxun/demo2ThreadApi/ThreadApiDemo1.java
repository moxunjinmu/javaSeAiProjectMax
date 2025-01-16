package com.moxun.demo2ThreadApi;

public class ThreadApiDemo1 {
    public static void main(String[] args) {
        //目标：认识多线程，掌握创建线程的方式一：继承Thread类来实现

        MyThread mt1 = new MyThread();
        mt1.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程"+i);
        }
        Thread thread = Thread.currentThread();

        System.out.println("主线程开始"+ thread.getName());
    }
}

//1、定义一个子类继承Thread类，成为一个线程类。
class MyThread extends Thread{
    //2、重写Thread类中的run方法，在其中编写线程要执行的代码
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            Thread thread = Thread.currentThread();
            System.out.println(thread.getName()+"我在看视频");
        }
    }
}