package com.moxun.demo1hashset;

import java.util.Comparator;
import java.util.TreeSet;

public class SetDemo3 {
    public static void main(String[] args) {
        TreeSet<Teacher> teachers = new TreeSet<>(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher t1, Teacher t2) {
                return t1.getAge() - t2.getAge();
            }
        });
//        TreeSet<Teacher> teachers = new TreeSet<>((t1, t2) -> t1.getAge() - t2.getAge());
        teachers.add(new Teacher("张三", 23, "男"));
        teachers.add(new Teacher("李四", 25, "女"));
        teachers.add(new Teacher("王五", 22, "男"));
        teachers.add(new Teacher("赵六", 24, "女"));


    }
}
