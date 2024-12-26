package com.moxun.demo4Genericity;

import java.util.ArrayList;

public class GenericDemo5 {
    public static void main(String[] args) {
        // 目标：通配符和上下限
        ArrayList<XiaoMi> xiaomi = new ArrayList<>();
        xiaomi.add(new XiaoMi());
        xiaomi.add(new XiaoMi());
        xiaomi.add(new XiaoMi());
        go(xiaomi);
    }

    public static void go(ArrayList<?> cars){

    }

    /**
     * 处理汽车列表的方法
     *
     * @param cars 汽车列表，列表中的元素是Car或其子类的实例
     */
    public static void go1(ArrayList<? extends Car>  cars) {}
}
