package com.moxun.demo17CommonsIO;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class CommonsIODemo {
    public static void main(String[] args) throws Exception {
        FileUtils.copyFile(new File("day03-file-io\\src\\com\\moxun\\demo17CommonsIO\\default.txt"), new File("day03-file-io\\src\\com\\moxun\\demo17CommonsIO\\default1.txt"));
        FileUtils.delete(new File("day03-file-io\\src\\com\\moxun\\demo17CommonsIO\\default.txt"));
//        FileUtils.deleteDirectory(new File("day03-file-io\\src\\com\\moxun\\demo17CommonsIO"));

    }
}
