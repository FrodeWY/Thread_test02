package com.threads.synchronized_object;

/**
 * Created by K on 2017/10/12.
 */
public class Service {
    public void testMethod1(Synchronized_ObjectB objectB){
        try {
            synchronized (objectB) {
                System.out.println("Service__getLock Time:" + System.currentTimeMillis() + "   ThreadName:" + Thread.currentThread().getName());
                Thread.sleep(5000);
                System.out.println("Service__releaseLock Time:" + System.currentTimeMillis() + "   ThreadName:" + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
