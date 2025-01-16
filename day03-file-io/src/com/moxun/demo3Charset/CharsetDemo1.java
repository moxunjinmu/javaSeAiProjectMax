package com.moxun.demo3Charset;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CharsetDemo1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
//        目标：写程序实现字符编码和解码
//    1. 编码
        String name = "莫循" ;
        byte[] bytes = name.getBytes();
        byte[] bytes1 = name.getBytes("GBK");
        System.out.println(bytes.length);
        System.out.println(Arrays.toString(bytes));

        System.out.println(bytes1.length);
        System.out.println(Arrays.toString(bytes1));

//        2. 解码
        String name2 = new String(bytes);
        System.out.println(name2);
        String name3 = new String(bytes1, "GBK");
        System.out.println(name3);
    }
}
