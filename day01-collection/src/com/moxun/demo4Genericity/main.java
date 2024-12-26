package com.moxun.demo4Genericity;

import com.moxun.demo2Genericity.Student;

public class main {
    public static void main(String[] args) {
        String[] str = {"1","2"};
        Student[] stu = new Student[10];
        Student max = getMax(stu);
    }

    public static void printArray(){}

    /**
     * 打印数组中的元素
     *
     * @param <T> 数组元素的类型
     * @param arr 要打印的数组
     */
    public static <T> void printArray(T[] arr){}

    /**
     * 获取数组中的最大值
     *
     * @param <T> 数组元素的类型
     * @param arr 要查找最大值的数组
     * @return 数组中的最大值
     */
    public static <T> T getMax(T[] arr){
        return arr[0];
    }
}
