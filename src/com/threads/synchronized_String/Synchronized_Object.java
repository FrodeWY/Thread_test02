package com.threads.synchronized_String;

/**
 * Created by K on 2017/10/14.
 */
public class Synchronized_Object {
    public static void  print(Object o){
        synchronized (o){
            while (true){
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
