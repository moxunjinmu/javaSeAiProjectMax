package com.moxun.demo7ExecutorService;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"MyRunnable" + i);
            try {
                Thread.sleep(1000000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
