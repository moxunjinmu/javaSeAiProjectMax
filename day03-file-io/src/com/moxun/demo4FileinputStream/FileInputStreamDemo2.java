package com.moxun.demo4FileinputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        //目标：掌握文件字节输入流读取文件中的字节数组到内存中来。
        //1、创建文件字节输入流管道于源文件接通
//        FileInputStream fileInputStream = new FileInputStream(new File("\\day03-file-io\\src\\com\\moxun\\demo4FileinputStream\\moxun.txt"));
        FileInputStream fileInputStream = new FileInputStream("day03-file-io\\src\\com\\moxun\\demo4FileinputStream\\moxun.txt");

//        2.开始读取文件中的字节并输出
//        定义一个变量记住每次读取的一个字节
        byte[] buffer = new byte[3];
        int len;
        while ((len = fileInputStream.read(buffer)) != -1) {
//            System.out.print((char) len);
            String str = new String(buffer, 0, len);
            System.out.println(str);
        }
        //拓展：每次读取多个字节，性能得到提升，因为每次读取多个字节，可以减少硬盘和内存的交互次数，从而提升性能。
        //依然无法避免读取汉字输出乱码的问题：存在截断汉字字节的可能性！

    }
}
