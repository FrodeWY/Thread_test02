package com.test.synchronized_wireless_loop;

import com.threads.synchronized_Wireless_loop.synchronized_Wireless_loop;

/**
 * Created by K on 2017/10/14.
 *//**
 * synchronized导致的死锁*/
public class Synchronized_wireless_loop {
    public static void main(String[] args) {
        synchronized_Wireless_loop synchronized_wireless_loop = new synchronized_Wireless_loop();
        Thread threadA=new Thread("A"){
            @Override
            public void run() {
                super.run();
                synchronized_wireless_loop.methodA();
            }
        };
        Thread threadB=new Thread("B"){
            @Override
            public void run() {
                super.run();
                synchronized_wireless_loop.methodB();
            }
        };
        threadA.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadB.start();
    }
}
