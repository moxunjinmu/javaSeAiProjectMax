package com.moxun.demo6TCP3;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ServiceThread extends Thread {
    private Socket socket;
    public ServiceThread(Socket socket) {
        this.socket = socket;
    }
    @Override
    public void run() {
        try {
            //        3、获取输入流，读取客户端发送的数据
            InputStream is = socket.getInputStream();
//        4、把字节输入流包装成特殊数据输入流
            DataInputStream dis = new DataInputStream(is);
//        5.读取数据
            while(true) {
                String message = dis.readUTF();
                String IP =socket.getInetAddress().getHostAddress();
                int port = socket.getPort();
                System.out.println("服务端收到数据！" + IP + ":" + port + "发送的数据为：" + message);
                System.out.println("----------------------------------------------");
            }
        } catch (Exception e) {
            System.out.println("客户端下线！" + socket.getInetAddress().getHostAddress() + ":" + socket.getPort());
            e.printStackTrace();

        }
    }
}
