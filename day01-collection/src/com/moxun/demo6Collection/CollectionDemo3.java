package com.moxun.demo6Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo3 {
    public static void main(String[] args) {
//        Collection遍历方式1：迭代器Iterator
        Collection<String> coll = new ArrayList<>();
        coll.add("Hello");
        coll.add("World");
        coll.add("Java");
        coll.add("Python");
        Iterator<String> it = coll.iterator();
//        System.out.println(it.next());
        while (it.hasNext()) {
            System.out.println(it.next());
        }
//        for循环遍历方式2：for循环
        //增强for循环，底层仍然使用了迭代器Iterator
        for (String s : coll) {
            System.out.println(s);
        }

        // lambda表达式遍历方式3：Lambda表达式
        coll.forEach(System.out::println);
        coll.forEach(s -> System.out.println(s));
    }
}
