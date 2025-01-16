package com.moxun.demo2Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapExampleDemo6 {
    public static void main(String[] args) {
        //目标：Map集合的遍历方式
        Map<String, Integer> map = new HashMap<>(); // 一行经典代码：创建了一个HashMap集合
        map.put("moXun", 1);
        map.put("jinMu", 2);
        map.put("ff", 3);

        //遍历方式三：Lambda表达式
//        map.forEach(new BiConsumer<String, Integer>() {
//            @Override
//            public void accept(String s, Integer integer) {
//                System.out.println(s + " " + integer);
//            }
//        });
      
        map.forEach((k, v) -> System.out.println(k + " " + v));
        HashSet<Object> objects = new HashSet<>();
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put(1,2);
        objects.add(objectObjectHashMap);
        System.out.println(objects);
        HashMap<Object, Object> objectObjectHashMap1 = new HashMap<>();
//        objectObjectHashMap1.put(2,3);
        objectObjectHashMap.put(objectObjectHashMap1,3);
        System.out.println(objectObjectHashMap);
        objectObjectHashMap1.put(2,3);
        System.out.println(objectObjectHashMap);
        objectObjectHashMap.put(objectObjectHashMap1,4);
        System.out.println(objectObjectHashMap);
    }

}
