package com.moxun.demo6Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionDemo1 {
    public static void main(String[] args) {
//        目标：搞清楚Collection集合的整体特点
//        1. List家族的集合：有序，可以重复，有索引
        List<String> list = new ArrayList();
        list.add("A");
        list.add("B");
        String rs = list.get(0);
        System.out.println(rs);

//        2. Set家族的集合：无序，不可以重复，没有索引
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("A");
        System.out.println(set);
    }
}
