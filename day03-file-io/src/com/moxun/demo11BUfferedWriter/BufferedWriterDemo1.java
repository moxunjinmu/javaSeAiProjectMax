package com.moxun.demo11BUfferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class BufferedWriterDemo1 {
    public static void main(String[] args) {
//        目标：搞清楚缓冲字符输出流的使用：提升了字符输出流的写字符的性能，多了换行功能

//        字符串文件写入操作
        try(
//                创建一个字符输出流对象，指定写出的地址
//                FileWriter bfw = new FileWriter("day03-file-io\\file8.txt"); // 覆盖管道
//                选中单词 shift+ f6 可以批量修改
                Writer fw = new FileWriter("day03-file-io\\file8.txt", true); // 追加管道
//                2,创建一个缓冲字符输出流对象，把字符输出流对象作为构造参数传递给缓冲字符输出流对象
                BufferedWriter bfw = new BufferedWriter(fw); // 包装流，提升性能 仍然是追加模式，低级管道决定特性，高级管道决定性能
        ) {
//            2. 写一个字符：public void write(int c)
            bfw.write("c");
            bfw.write(98);
            bfw.write("吴");
            bfw.newLine(); // 换行，底层调用的是write("\r\n")
//            3. 写一个字符串： public void write(String str)
            bfw.write("Hello World");
            bfw.newLine();

//            4.写字符串的一部分
            bfw.write("Hello World", 0, 5);
            bfw.newLine();
//            5. 写一个字符数组： public void write(Char[] cbuf)
            char[] chars = "moXun".toCharArray();
            bfw.write(chars);
            bfw.newLine();
//            6. 写一个字符数组的一：public void write(Char[] cbuf, int off, int len)
            bfw.write(chars, 0, chars.length);

            bfw.flush(); // 刷新缓冲区, 强制把缓冲区的内容写出到文件中
//            刷新后，流可以继续使用

            bfw.close(); // 关闭流, 关闭包含了刷新，关闭后流不能继续使用
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
