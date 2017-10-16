package com.threads.synchronized_Lock;

/**
 * Created by K on 2017/10/10.
 */
public class MyObject_a {
   synchronized public void methodA(){
        try {
            System.out.println("begin MethodA ThreadName="+Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end Time: "+System.currentTimeMillis()+"  Name:"+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void methodB(){
        try {
            System.out.println("begin MethodA ThreadName="+Thread.currentThread().getName()+"start Time: "+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("end Name:"+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

   synchronized public void methodC(){
        try {
            System.out.println("begin MethodA ThreadName="+Thread.currentThread().getName()+"start Time: "+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("end Name:"+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
