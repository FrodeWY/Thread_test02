package com.threads.synchronized_Lock;

/**
 * Created by K on 2017/10/10.
 */
public class MyObjectA {
    public void methodA(){
        try {
            System.out.println("begin MethodA ThreadName="+Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
