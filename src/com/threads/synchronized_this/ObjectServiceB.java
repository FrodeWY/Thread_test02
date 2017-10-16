package com.threads.synchronized_this;

/**
 * Created by K on 2017/10/11.
 */
public class ObjectServiceB {
    public void serviceMethodA(){
        try {
            synchronized (this){
                System.out.println("A begin time"+System.currentTimeMillis());
                Thread.sleep(2000);
                System.out.println("A begin time" + System.currentTimeMillis());

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void serviceMethodB(){
            synchronized (this){
                System.out.println("B begin time"+System.currentTimeMillis());
                System.out.println("B begin time" + System.currentTimeMillis());
            }
    }
    synchronized public void serviceMethod(){

            System.out.println("C begin time"+System.currentTimeMillis());
            System.out.println("C begin time" + System.currentTimeMillis());

    }
}
