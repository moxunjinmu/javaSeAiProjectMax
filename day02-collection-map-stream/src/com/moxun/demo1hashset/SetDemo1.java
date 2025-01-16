package com.moxun.demo1hashset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {
    public static void main(String[] args) {


        System.out.println(1111);
//        创建一个set集合，特点：
        Set<String> set = new HashSet<>(); // 一行经典代码
        set.add("A");
        set.add("c");
        set.add("C");
        set.add("D");

//        创建一个LinkedSet
        Set<String> set2 = new LinkedHashSet<>();
        set2.add("E");
        set2.add("N");
        set2.add("G");
        set2.add("H");

//        创建一个TreeSet
        Set<Double> set3 = new TreeSet<>();
        set3.add(3.4);
        set3.add(5.0);
        set3.add(1.2);
        set3.add(6.3);
    }
}
