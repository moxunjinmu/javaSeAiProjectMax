package com.moxun.demo8FileWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterDemo1 {
    public static void main(String[] args) {
//        字符串文件写入操作
        try(
//                创建一个字符输出流对象，指定写出的地址
//                FileWriter fw = new FileWriter("day03-file-io\\file8.txt"); // 覆盖管道

                FileWriter fw = new FileWriter("day03-file-io\\file8.txt", true); // 追加管道
                ) {
//            2. 写一个字符：public void write(int c)
            fw.write("c");
            fw.write(98);
            fw.write("吴");
            fw.write("\r\n");
//            3. 写一个字符串： public void write(String str)
            fw.write("Hello World");
            fw.write("\r\n");

//            4.写字符串的一部分
            fw.write("Hello World", 0, 5);
            fw.write("\r\n");
//            5. 写一个字符数组： public void write(Char[] cbuf)
            char[] chars = "moXun".toCharArray();
            fw.write(chars);
            fw.write("\r\n");
//            6. 写一个字符数组的一：public void write(Char[] cbuf, int off, int len)
            fw.write(chars, 0, chars.length);

            fw.flush(); // 刷新缓冲区, 强制把缓冲区的内容写出到文件中
//            刷新后，流可以继续使用

            fw.close(); // 关闭流, 关闭包含了刷新，关闭后流不能继续使用
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
