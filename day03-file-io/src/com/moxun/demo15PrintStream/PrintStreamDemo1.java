package com.moxun.demo15PrintStream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamDemo1 {
    public static void main(String[] args) {
        try(
//                PrintStream ps = new PrintStream("day03-file-io/src/com/moxun/demo15PrintStream/demo1.txt");
                PrintStream ps = new PrintStream(new FileOutputStream("day03-file-io/src/com/moxun/demo15PrintStream/demo1.txt",true)); //追加管道
                ){
            ps.println("hello world!");
            ps.println(97);
            ps.println("莫循");
            ps.println(true);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
