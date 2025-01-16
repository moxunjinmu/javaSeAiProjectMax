package com.moxun.demo14InputStreamReader;

import java.io.*;

public class InputStreamReaderDemo1 {
    public static void main(String[] args) {
//目标：Q用字符输入转换流InputStreamReader解决不同编码读取乱码的问题、
//代码：UTF-8 文件:UTF-8 读取不乱码
//代码：UTF-8 文件:GBK   读取乱码
        try(
//                先提取文件的原始字节流
                InputStream is = new FileInputStream("day03-file-io/src/com/moxun/demo14InputStreamReader/demo1.txt");
//                指定字符集把字节流转换为字符流
                InputStreamReader isr = new InputStreamReader(is, "GBK");
//                使用缓冲字符流包裹字符输入转换流
                BufferedReader br = new BufferedReader(isr);
        ){
            String line;
//            逐行读取文本内容
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
