package com.moxun.demo16DataInputStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputStreamDemo1 {
    public static void main(String[] args) {
//        目标：特殊数据流的使用
        try(
                DataOutputStream dos = new DataOutputStream(new FileOutputStream("day03-file-io/src/com/moxun/demo16DataInputStream/demo1.txt"));
                DataInputStream dis = new DataInputStream(new FileInputStream("day03-file-io/src/com/moxun/demo16DataInputStream/demo1.txt"));
                ){
            dos.writeUTF("hello");
            dos.writeChar('a');
            dos.writeFloat(1);
            dos.writeInt(2);
            dos.writeLong(3);
//            读取和写入顺序一致，否则会出错，因为底层是二进制存储的
            System.out.println(dis.readUTF());
            System.out.println(dis.readChar());
            System.out.println(dis.readFloat());
            System.out.println(dis.readInt());
            System.out.println(dis.readLong());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
