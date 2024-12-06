package com.moxun.collectionDemo1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo1 {
    public static void main(String[] args) {
        show();
    }
    public static void show() {
        int[] arr = {1, 2, 3};
//        运行时异常的特点：编译阶段不报错，运行时出现的异常，继承自RuntimeException,
        System.out.println(arr[3]); // 数组下标越界异常 ArrayIndexOutOfBoundsException
        System.out.println(10 / 0); // 运行时异常：算术异常 ArithmeticException
//        空指针异常：NullPointerException
        String str = null;
        System.out.println(str);
        System.out.println(str.length());
    }

    public static void show2()  {
//    编译异常：语法错误，编译阶段报错
//    把字符串时间解析成java的一个日期对象
    try{
        String str = "2019-12-31";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(str); // 编译时间异常：提醒程序员这里的程序很容易出错，请注意}
    } catch (ParseException e) {
        e.printStackTrace();
    }

    }

}
