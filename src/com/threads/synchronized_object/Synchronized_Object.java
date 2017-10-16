package com.threads.synchronized_object;

/**
 * Created by K on 2017/10/12.
 */
public class Synchronized_Object {
    public void testMethodA(Object o){
        try {
            synchronized (o){
                System.out.println("testMethodA__getLock Time:"+System.currentTimeMillis()+"   ThreadName:"+Thread.currentThread().getName());
                Thread.sleep(2000);
                System.out.println("testMethodA__releaseLock Time:"+System.currentTimeMillis()+"   ThreadName:"+Thread.currentThread().getName());

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
