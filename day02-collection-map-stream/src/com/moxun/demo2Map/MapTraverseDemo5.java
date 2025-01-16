package com.moxun.demo2Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class MapTraverseDemo5 {
    public static void main(String[] args) {
        //目标：Map集合的遍历方式
        Map<String, Integer> map = new HashMap<>(); // 一行经典代码：创建了一个HashMap集合
        map.put("moXun", 1);
        map.put("jinMu", 2);
        map.put("ff", 3);

        //遍历方式三：Lambda表达式
        map.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {
                System.out.println(s + " " + integer);
            }
        });

        map.forEach((k, v) -> System.out.println(k + " " + v));

    }

}
