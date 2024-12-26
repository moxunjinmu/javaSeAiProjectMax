package com.moxun.demo8Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieService {

    private static List<Movie> movies = new ArrayList<>();
    private Scanner sc = new  Scanner(System.in);



    /**
     * 启动服务
     */
    public void start(){
        while (true) {
            System.out.println("欢迎使用电影管理系统,请选择操作的选项:");
            System.out.println("1.上架电影");
            System.out.println("2.下架电影");
            System.out.println("3.查询电影");
            System.out.println("4.封杀电影");
            System.out.println("5.查询所有电影");
            System.out.println("6.修改电影");
            System.out.println("7.退出系统");
            String choice = sc.next();
            switch (choice){
                case "1":
                    addMovie();
                    break;
                case "2":
                    removeMovie();
                    break;
                case "3":
                    findMovie();
                    break;
                case "4":
                    banMovie();
                    break;
                case "5":
                    queryAllMovies();
                    break;
                case "6":
                    editMovie();
                    break;
                case "7":
                    System.out.println("退出系统!");
                    return;
                default:
                    System.out.println("输入有误,请重新选择!");
                    break;
            }
        }
    }

    private void editMovie() {
    }

    private void queryAllMovies() {
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

    private void removeMovie() {

    }

    private void addMovie() {
        Movie movie = new Movie();
        // 1.输入电影名称
        System.out.println("请输入电影名称:");
        movie.setName(sc.next());
        // 2.输入演员名称
        System.out.println("请输入演员名称:");
        movie.setActor(sc.next());
        // 3.输入电影价格
        System.out.println("请输入电影价格:");
        movie.setPrice(sc.nextDouble());
        // 4.输入电影评分
        System.out.println("请输入电影评分:");
        movie.setScore(sc.next());
        movies.add(movie);
        System.out.println("上架成功!"+ movie);
    }

    private void banMovie() {

    }

    private void findMovie() {

    }
}
