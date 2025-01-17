package com.moxun.demo6TCP3;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TCPClientDemo1 {
    public static void main(String[] args) throws Exception {
        //目标：实现TCP通信下多发多收：客户端开发。
        //1、常见Socket管道对象，请求与服务端的Socket链接。可靠链接
        Scanner sc = new Scanner(System.in);
        Socket sk = new Socket("127.0.0.1", 8080);
        //2、从socket.通信管道中得到一个字节输出流。
        OutputStream os = sk.getOutputStream();
        //3.特殊数据流
        DataOutputStream dos = new DataOutputStream(os);
        while (true) {
            System.out.print("Enter command: ");
            String st = sc.nextLine();
            if(st.equals("exit")){
                System.out.println("Goodbye!");
                dos.close();
                sk.close();
                sc.close();
                break;
            }

            dos.writeUTF(st);
            dos.flush();
        }

    }
}
