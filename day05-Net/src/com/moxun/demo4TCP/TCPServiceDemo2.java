package com.moxun.demo4TCP;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServiceDemo2 {
    public static void main(String[] args) throws Exception {
        //目标：实现TCP通信下一发一收：服务端开发。
        //1、创建服务端ServerSocket对象，绑定端口号，监听客户端连接
        ServerSocket socket = new ServerSocket(8080);
        //        2、调用accept方法，阻塞等待客户揣连接，一旦有客户端链接会返回一个Socket对象
        Socket accept = socket.accept();
//        3、获取输入流，读取客户端发送的数据
        InputStream is = accept.getInputStream();
//        4、把字节输入流包装成特殊数据输入流
        DataInputStream dis = new DataInputStream(is);
        try {
            while (true) {
    //        5.读取数据
                String message = dis.readUTF(); // 等待读取客户端发送的数据
                String IP =accept.getInetAddress().getHostAddress();
                int port = accept.getPort();
                System.out.println("服务端收到数据！" + IP + ":" + port + "发送的数据为：" + message);
            }
        } catch (IOException e) {
            System.out.println("客户端断开连接！");
        }
    }
}
