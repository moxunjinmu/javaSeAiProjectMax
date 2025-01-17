package com.moxun.demo2UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServiceDemo2 {
    public static void main(String[] args) throws Exception {
        DatagramSocket datagramSocket = new DatagramSocket(8080);

        byte[] bytes = new byte[1024 * 64];
        //2、创建一个数据包对象负责接收数据。（非菜盘子）
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);

        //3、接收数据，将数据封装到数据包对象的字节数组中去
        datagramSocket.receive(datagramPacket);

        //4、看看数据是否收到了
        int len = datagramPacket.getLength();
        String st = new String(bytes, 0, len);
        System.out.println(st);

        // 获取对方的ip地址和端口
        String ip = datagramPacket.getAddress().getHostAddress();
        int port = datagramPacket.getPort();
        System.out.println("IP: " + ip + " Port: " + port);
        datagramSocket.close();
    }
}
