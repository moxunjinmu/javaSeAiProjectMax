package com.moxun.demo1Genericity;

import java.util.ArrayList;

public class GenericDemo1 {
//    目标：搞清楚泛型的好处
public static void main(String[] args) {
    ArrayList<String> arrList = new ArrayList<String>();
    arrList.add("A");
    arrList.add("B");
    arrList.add("C");
    arrList.add(String.valueOf(222));

//    arrList.add(1);arrList.add(2);arrList.add(3);arrList.add(4);
    for (int i = 0; i < arrList.size(); i++) {
//        Object rs = arrList.get(i);
//        数据转型处理
//        String s = (String) rs;
//        System.out.println(s);

        //        String s = (String) rs;
        String s = arrList.get(i);
        System.out.println(s);
    }
}
}
