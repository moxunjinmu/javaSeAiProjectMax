package com.moxun.demo3UDP2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPClientDemo1 {
    public static void main(String[] args) throws Exception {
        //目标：完成UDP通信多发多收：客户端开发。

        //1、创建发送端对象（代表抛韭菜的人）
        DatagramSocket datagramSocket = new DatagramSocket(); // 默认端口号：1024-65535
        //2、创建数据包对象封装要发送的数据。
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            if(command.equals("quit")) {
                datagramSocket.close();
                break;
            }
            byte[] bytes = command.getBytes();
            DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost(), 8080);
            datagramSocket.send(datagramPacket);
        } while (true);
    }
}
