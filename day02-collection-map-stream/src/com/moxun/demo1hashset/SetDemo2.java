package com.moxun.demo1hashset;

import java.util.HashSet;
import java.util.Set;

public class SetDemo2 {
    public static void main(String[] args) {
        Set<Student> setStudent = new HashSet<>();

        setStudent.add(new Student("张三", 20, "男"));
        setStudent.add(new Student("李四", 21, "女"));
        setStudent.add(new Student("张三", 20, "男"));
        setStudent.add(new Student("赵六", 23, "女"));

        System.out.println(setStudent);
    }
}
