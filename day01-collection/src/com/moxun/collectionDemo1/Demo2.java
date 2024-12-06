package com.moxun.collectionDemo1;

public class Demo2 {
//    异常的作用： 1. 提前预知错误，并提前处理 2. 阻止错误继续传播 3. 阻止异常的默认处理 4. 自定义异常

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 0;
        div1(a, b);
        int d = 0;
        try {
            d = div2(a, c);
        } catch (Exception e) {
            System.out.println("catch: 底层方法调用失败");
            throw new RuntimeException(e);
        }
        System.out.println(d);
    }

    public static int div1(int a, int b) throws ArithmeticException {
        if(b == 0) {
            throw new ArithmeticException("除数不能为0");
        }
        return a / b;
    }

    public static int div2(int a, int b) throws Exception {
        if(b == 0) {
            throw new Exception("除数不能为0");
        }
        return a / b;
    }
}
