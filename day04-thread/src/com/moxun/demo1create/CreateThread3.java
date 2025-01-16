package com.moxun.demo1create;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CreateThread3 {
    public static void main(String[] args)  {
//        目标：掌握多线程的创建方式三：实现Callable.接口，方式三的优势：可以获取线程执行完毕后的结果的。

        // 3、创建一个Callable接口的实现类对象。
        Callable myCallable = new MyCallable(100);
        // 4、把Callable对象封装成一个真正的线程任务对象FutureTask对象。
        /**
         * 未来任务对象的作用？
         *    a、本质是一个Runnable线程任务对象，可以交给Thread线程对象处理。
         *    b、可以获取线程执行完毕后的结果。
         */
        FutureTask<String> st = new FutureTask<>(myCallable);
//        5、把FutureTask对象作为参数传递给Thread线程对象。
        new Thread(st).start();

        Callable mc2 = new MyCallable(150);
        FutureTask<String> st2 = new FutureTask<>(mc2);
        new Thread(st2).start();




//        获取子线程执行完毕后的结果
        try{
//            如果主线程发现第一个线程还没有执行完毕，会让出CPU,等第一个线程执行完毕后，才会往下执行！
            System.out.println( st.get());
        }catch (Exception e){
            e.printStackTrace();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("主线程执行中");
        }

        try{
            System.out.println( st2.get());
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
//1、定义一个实现类实现Callable接口
class MyCallable implements Callable<String> {
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
