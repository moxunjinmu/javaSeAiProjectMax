package com.moxun.demo8Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ThreadGetReadPacket {

    public static void main(String[] args) {
        //目标：完成多线程的综合小案例
        //红包雨游戏，某企业有100名员工，员工的工号依次是1,2,3,4，··到100.
        // 现在公司举办了年会活动，活动中有一个红包雨环节，要求共计发出200个红包雨。其中小红包在[1·30]元之间，
        //总占比为80%，大红包[31-100]元，总占比为20%。
        //分析：100个员工实际上就是100个线程，来竞争200个红包。
        ArrayList<Integer> redPacket = getRedPacket();
        for (int i = 0; i <= 100; i++) {
            new PeopleGetReadPacketThread(i,redPacket).start();
        }

    }
    // 生成200个红包雨，小红包和大红包的比例为8:2
    public static ArrayList<Integer> getRedPacket(){
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 160; i++) {
            list.add(rand.nextInt(30)+1);
        }
        for (int i = 0; i < 40; i++) {
            list.add(rand.nextInt(70)+31);
        }
        return list;
    }
}
