package com.moxun.demo10BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderDemo1 {
    public static void main(String[] args) throws Exception {
//        目标：搞清楚缓冲字符输入流读取字符内容：性能提升了，多了按照行读取文本的能力。
        try(
                FileReader fr = new FileReader("day03-file-io\\file7.txt");
//                2、创建缓冲字符输入流包装低级的字符输入流
                BufferedReader bfr = new BufferedReader(fr);
        ){
//            定义一个字符数组，每次读取多个字符
//            int len;
//            char[] chars = new char[1024];
//            while ((len = bfr.read(chars)) != -1) {
//                String str = new String(chars, 0, len);
//                System.out.print(str);
//            }
//            循环读取一行文本内容，直到文件末尾。
//            目前读取文本最优雅的方式：性能好，不乱码，可以按行读取
            String line;
            while ((line = bfr.readLine()) != null) {
                System.out.println(line);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
