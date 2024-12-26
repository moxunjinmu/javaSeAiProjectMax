package com.moxun.demo5Genericity;

import java.util.ArrayList;

public class GenericDemo6 {
    public static void main(String[] args) {
//        泛型不支持基本数据类型，所以下面的写法是错误的。
//        ArrayList<int> list = new ArrayList<>();
//        原因：泛型擦除，泛型只在编译阶段有效，在运行阶段会被擦除，使用泛型的地方会被替换为Object类型。
//        解决方案：使用包装类，例如Integer。

//        包装类新增的功能
//        1.把基本数据类型转换为字符串
        int j = 10;
        String re1 = Integer.toString(j);

        System.out.println(re1 + 1);

        Integer i1 = j;
        String re2 = Integer.toString(i1);
        System.out.println(re2 + 1);

        String re3 = j + "";
        System.out.println(re3 + 1);

//        2.把字符串转换为对应基本数据类型（很有用）
        int i = Integer.parseInt("123");
        System.out.println(i + 1);
//        更推荐.valueOf()方法，因为该方法在内部进行了优化处理。
        int i2 = Integer.valueOf("123");
        System.out.println(i2 + 1);
    }
}
