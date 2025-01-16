package com.moxun.demo2Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo3 {
    public static void main(String[] args) {
//        目标：Map集合的遍历方式
        Map<String, Integer> map = new HashMap<>(); // 一行经典代码：创建了一个HashMap集合
        map.put("moXun", 1);
        map.put("jinMu", 2);
        map.put("ff", 3);

//        遍历方式一：键找值
//        获取所有键的集合
        Set<String> keySet = map.keySet();

//        根据键的集合遍历
     for (String key : keySet) {
         Integer value = map.get(key);
         System.out.println(key + ":" + value);
     }
     //        遍历方式二：键值对

//        1. 把Hap集合转换成Set集合，里面的元素类型都是键值对类型(Map.Entry<String,Integer>)
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
//        2、遍历Set集合，得到每一个键值对类型元素
     for (Map.Entry<String, Integer> entry : entries) {
         String key = entry.getKey();
         Integer value = entry.getValue();
         System.out.println(key + ":" + value);
     }
    }

}
