package com.moxun.demo6Copy;

import java.io.*;

public class CopyDemo1 {
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
        InputStream is = null;
        OutputStream os = null;
        try{
            is = new FileInputStream(srcPath);
            os = new FileOutputStream(destPath);
            int len;
            byte[] bytes = new byte[1024];
//            2. 读取一个字节数组，写入一个字节数组
            while ((len = is.read(bytes)) != -1) {
                os.write(bytes, 0, len);
            }
            System.out.println("复制成功");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
//            最后一定会执行一次，即使出现异常也会执行
//            3. 释放资源
            try{
                if(is != null) is.close();
            } catch(Exception e){
                e.printStackTrace();
            }
            try{
                if(os != null) os.close();
            } catch(Exception e){
                e.printStackTrace();
            }
        }

    }
}
