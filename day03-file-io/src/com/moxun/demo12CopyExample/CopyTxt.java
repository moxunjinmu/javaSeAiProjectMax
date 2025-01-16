package com.moxun.demo12CopyExample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CopyTxt {
    public static void main(String[] args) {

        try(
                FileReader fr = new FileReader("day03-file-io/file12.txt");
                BufferedReader br = new BufferedReader(fr);
                FileWriter fw = new FileWriter("day03-file-io/file12_copy.txt", true);
                BufferedWriter bw = new BufferedWriter(fw);
                ){
            ArrayList<String> list = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
            System.out.println(list);
            Collections.sort(list);
            System.out.println(list);
            for (String s : list) {
                bw.write(s);
                bw.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
