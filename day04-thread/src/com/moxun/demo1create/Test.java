package com.moxun.demo1create;

public class Test {
    public static void main(String[] args) {
        //目标：认识多线程，掌握创建线程的方式一：继承Thread类来实现

        MyThread mt = new MyThread();
        mt.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程"+i);
        }
        System.out.println("主线程开始");
    }
}

//1、定义一个子类继承Thread类，成为一个线程类。
class MyThread extends Thread{
    //2、重写Thread类中的run方法，在其中编写线程要执行的代码
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("我在看视频");
        }
    }
}