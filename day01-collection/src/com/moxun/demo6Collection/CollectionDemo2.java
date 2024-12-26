package com.moxun.demo6Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo2 {
    public static void main(String[] args) {
//        Collection常用功能的使用
        Collection<String> coll = new ArrayList<>();
        coll.add("Hello");
        coll.add("World");
        coll.add("Java");
        coll.add("Python");

        coll.remove("World");
        System.out.println(coll);
    }
}
