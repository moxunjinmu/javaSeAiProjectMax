package com.moxun.demo2UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPClientDemo1 {
    public static void main(String[] args) throws Exception {
        //目标：完成UDP通信一发一收：客户端开发。
        //1、创建发送端对象（代表抛韭菜的人）
        DatagramSocket datagramSocket = new DatagramSocket(); // 默认端口号：1024-65535
        //2、创建数据包对象封装要发送的数据。
        byte[] bytes = "测试UDP通信一发一收：客户端开发。".getBytes();

        /**
         *public DatagramPacket(byte[]buf,int length,
         *InetAddress address,int po
         * 参数一：发送的数据，字节数组（非菜）
         *参数二：发送的字节长度。
         *参数三：目的地的IP地址。
         *参数四：服务端程序的端口号
         */
        DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length, InetAddress.getLocalHost(),8080);

        datagramSocket.send(datagramPacket);
        datagramSocket.close();
    }
}
