package com.moxun.demo6Copy;

import java.io.*;

public class CopyDemo2 {
    public static void main(String[] args) {
//        使用字节流完成文件的复制操作

        try{
//            复制过去的时候必须带文件名，无法自动生成文件名
            copyFile("D:\\CloudMusic\\歌词.txt", "D:\\CloudMusic\\歌词1.txt");
        }catch(Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }


    }
    public static void copyFile(String srcPath, String destPath) throws Exception {

//        1、创建一个文件字节输入流管道与源文件接通

        try(
//                这里只能放置资源对象，用完后，最终会自动调用其cLos方法关闭！！
                FileInputStream is = new FileInputStream(srcPath);
                FileOutputStream os = new FileOutputStream(destPath);
                MyClose autoCloseable = new MyClose(); // 自定义资源对象，用完自动关闭资源
        )
        {
            int len;
            byte[] bytes = new byte[1024];
//            2. 读取一个字节数组，写入一个字节数组
            while ((len = is.read(bytes)) != -1) {
                os.write(bytes, 0, len);
            }
            System.out.println("复制成功");
        } catch (Exception e) {
            System.out.println(e);
        }


    }


}
class MyClose implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("close了资源");
    }
}