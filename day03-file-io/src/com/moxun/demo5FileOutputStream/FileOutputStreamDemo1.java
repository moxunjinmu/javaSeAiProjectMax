package com.moxun.demo5FileOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileOutputStreamDemo1 {
    public static void main(String[] args) throws Exception {
//        学会使用文件字节输出流的使用
//        1.创建文件字节输出流管道与目标文件接通

        // 默认覆盖数据数据
//        OutputStream os = new FileOutputStream("day03-file-io/src/com/moxun/demo5FileOutputStream/test.txt");
        OutputStream os = new FileOutputStream("day03-file-io/src/com/moxun/demo5FileOutputStream/test.txt", true); // 追加数据

//        2.写入数据
        os.write(97); // 写入一个字节数据
        os.write('b'); // 写入一个字符数据
//        os.write('吴'); 乱码

        os.write("\r\n".getBytes()); // 写入换行符
        
        
//        3.写一个字节数组出去
        byte[] bytes = "莫循瑾木".getBytes();
        os.write(bytes);
        os.write("\r\n".getBytes());

//        4. 写一个字节数组的一部分出去
        os.write(bytes, 0, 3);
        os.write("\r\n".getBytes());

        os.close(); // 关闭管道，释放资源
    }
}
