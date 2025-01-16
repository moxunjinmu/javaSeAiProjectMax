package com.moxun.demo2Recursion;

import java.io.File;

public class FileSearchTest4 {
    public static void main(String[] args) {
        // 目标：完成文件搜索
        File file = new File("D:\\CloudMusic");

        searchFile(file, "歌词.txt");


    }
    public static void searchFile(File file, String searchWord) {
        // 判断file是不是目录
        if(!file.isDirectory()) {
            System.out.println("不是一个目录，直接返回");
            return;
        }

        File[] files = file.listFiles();
        if (files != null && files.length > 0) {
            for (File f : files) {
                if(f.isFile()) {
                    f.getName().contains(searchWord);
                    System.out.println("找到了：" + f.getAbsolutePath() + " 包含关键字：" + searchWord);
                } else {
                    searchFile(f, searchWord);
                }
            }
        }

    }
}
