package com.moxun.demo7TCP4;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

public class TCPServiceDemo {
    public static void main(String[] args) throws Exception {
        //目标：实现TCP通信下多发多收：服务端开发。
        //1、创建服务端ServerSocket对象，绑定端口号，监听客户端连接
        ServerSocket socket = new ServerSocket(8080);
        ThreadPoolExecutor executor = new ThreadPoolExecutor(3, 10, 5, TimeUnit.SECONDS, new ArrayBlockingQueue<>(100), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        while (true) {
            //        2、调用accept方法，阻塞等待客户揣连接，一旦有客户端链接会返回一个Socket对象
            Socket accept = socket.accept();
            //        3、创建线程，启动线程处理客户端请求
            System.out.println("客户端连接成功"+ accept.getInetAddress());
            executor.execute(new ServiceThread(accept));
        }

    }
}
