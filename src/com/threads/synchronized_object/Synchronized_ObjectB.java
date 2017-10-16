package com.threads.synchronized_object;

/**
 * Created by K on 2017/10/12.
 */
public class Synchronized_ObjectB {
    synchronized public void speedPrintString(){
        System.out.println("speedPrintString__getLock Time:"+System.currentTimeMillis()+"   ThreadName:"+Thread.currentThread().getName());
        System.out.println("-----------------------");
        System.out.println("speedPrintString__releaseLock Time:"+System.currentTimeMillis()+"   ThreadName:"+Thread.currentThread().getName());
    }

    public void speedPrintStringB(){
        synchronized (this){
            System.out.println("speedPrintString__getLock Time:"+System.currentTimeMillis()+"   ThreadName:"+Thread.currentThread().getName());
            System.out.println("-----------------------");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("speedPrintString__releaseLock Time:"+System.currentTimeMillis()+"   ThreadName:"+Thread.currentThread().getName());
        }
    }

}
