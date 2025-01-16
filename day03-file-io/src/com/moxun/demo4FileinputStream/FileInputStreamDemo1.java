package com.moxun.demo4FileinputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //目标：掌握文件字节输入流读取文件中的字节数组到内存中来。
        //1、创建文件字节输入流管道于源文件接通
//        FileInputStream fileInputStream = new FileInputStream(new File("\\day03-file-io\\src\\com\\moxun\\demo4FileinputStream\\moxun.txt"));
        FileInputStream fileInputStream = new FileInputStream("day03-file-io\\src\\com\\moxun\\demo4FileinputStream\\moxun.txt");

//        2.开始读取文件中的字节并输出
//        定义一个变量记住每次读取的一个字节
        int b;
        while ((b = fileInputStream.read()) != -1) {
            System.out.print((char) b);
        }
//        每次读取一个字节的问题：性能较差，读取汉字输出一定会乱码！

    }
}
