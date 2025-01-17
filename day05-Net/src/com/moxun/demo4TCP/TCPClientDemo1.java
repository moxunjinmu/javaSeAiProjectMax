package com.moxun.demo4TCP;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClientDemo1 {
    public static void main(String[] args) throws Exception {
        //目标：实现TCP通信下一发一收：客户端开发。
        //1、常见Socket管道对象，请求与服务端的Socket链接。可靠链接

        Socket sk = new Socket("127.0.0.1", 8080);
        //2、从socket.通信管道中得到一个字节输出流。
        OutputStream os = sk.getOutputStream();
        //3.特殊数据流
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeInt(1);
        dos.writeUTF("hello");
        sk.close();
    }
}
