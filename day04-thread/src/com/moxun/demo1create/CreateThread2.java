package com.moxun.demo1create;

public class CreateThread2 {
    public static void main(String[] args) {
//        创建多线程方式二：实现Runnable接口创建线程
//        3、创建线程任务类的对象代表一个线程任务。
        MyThread myThread = new MyThread();
//        4、把线程任务对象交给一个线程对象来处理
        Thread thread = new Thread(myThread);
//         5.启动线程
        thread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("main");
        }
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("MyRunnable");
        }
        System.out.println("MyRunnable");
    }
}
