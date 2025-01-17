package com.moxun.demo8Test;

import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.Random;

public class PeopleGetReadPacketThread extends Thread {

    private ArrayList<Integer> readPackets;

    public PeopleGetReadPacketThread(int name, ArrayList readPackets) {
        super(String.valueOf(name));
        this.readPackets = readPackets;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        while (true) {
            synchronized (readPackets) {

                if (readPackets.isEmpty()) {
                    break;
                }
//                随机从红包里取出一个红包，然后从红包中移除
                int index = (int) (Math.random() * readPackets.size());
                Object packet = readPackets.remove(index);
                System.out.println(name + "拿到红包" + packet);
                if (readPackets.isEmpty()) {
                    break;
                }
                try{
                    Thread.sleep(100);
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
