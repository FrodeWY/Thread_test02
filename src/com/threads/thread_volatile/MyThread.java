package com.threads.thread_volatile;

/**
 * Created by K on 2017/10/16.
 */
/**
 * volatile虽然增加了实例变量再多个线程之间的可见性，但他不具备同步性，那么也就不具备原子性*/
public class MyThread extends Thread {
    volatile public static  int count;
    private  static void addCount(){
        for (int i=0;i<100;i++){
            count++;
        }
        System.out.println(count);
    }

    @Override
    public void run() {
        super.run();
        addCount();
    }

    public static void main(String[] args) {
        MyThread[] myThreadArray=new MyThread[100];
        for (int i=0;i<100;i++){
            myThreadArray[i]=new MyThread();
        }
        for (int i=0;i<100;i++){
            myThreadArray[i].start();
        }
    }
}
