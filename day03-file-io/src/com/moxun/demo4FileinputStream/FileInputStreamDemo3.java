package com.moxun.demo4FileinputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamDemo3 {
    public static void main(String[] args) throws IOException {
        //目标：掌握文件字节输入流读取文件中的字节数组到内存中来。
        //1、创建文件字节输入流管道于源文件接通
        InputStream is = new FileInputStream("day03-file-io\\src\\com\\moxun\\demo4FileinputStream\\moxun1.txt");
        System.out.println(is);
//        一次性读完全部字节避免乱码问题
//        文件过大可能会溢出
        byte[] bytes = is.readAllBytes();
//        String str = new String(bytes);

    }
}
