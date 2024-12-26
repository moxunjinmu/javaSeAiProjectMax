package com.moxun.demo8Test;

public class Test {
    public static void main(String[] args) {
        // 目标：电影案例
//        1.创建电影对象，创建电影类
//        2.创建电影操作对象，用来实现电影业务处理上架，下架，查询等功能
        MovieService movieService = new MovieService();
        movieService.start();

    }
}
