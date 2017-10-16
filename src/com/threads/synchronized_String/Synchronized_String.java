package com.threads.synchronized_String;

/**
 * Created by K on 2017/10/14.
 */
public class Synchronized_String {
    public static void print(String param){
        try {
            synchronized (param){
                while (true){
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(1000);
                }

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
