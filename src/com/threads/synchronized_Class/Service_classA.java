package com.threads.synchronized_Class;

/**
 * Created by K on 2017/10/12.
 */
public class Service_classA {
    synchronized public static void printA(){
        System.out.println("ThreadName: "+Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"进入printA");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("ThreadName: "+Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"离开printA");

    }
    synchronized public static void printB(){
        System.out.println("ThreadName: "+Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"进入printB");
        System.out.println("ThreadName: "+Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"离开printB");

    }
    synchronized public  void printC(){
        System.out.println("ThreadName: "+Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"进入printC");

        System.out.println("ThreadName: "+Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"离开printC");

    }
    public void  printD(){
        synchronized (Service_classA.class){
            System.out.println("ThreadName: "+Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"进入printD");

            System.out.println("ThreadName: "+Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"离开printD");
        }
    }
}
