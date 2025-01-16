package com.moxun.demo7FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderDemo1 {
    public static void main(String[] args) throws Exception {
//        掌握文件字符输入流读取字符内容到程序来
        try(
                FileReader fr = new FileReader("day03-file-io\\file7.txt");
                ){
            int len;
            char[] chars = new char[1024];
            while ((len = fr.read(chars)) != -1) {
                String str = new String(chars, 0, len);
                System.out.print(str);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
