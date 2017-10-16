package com.threads.thread_volatile;

/**
 * Created by K on 2017/10/16.
 */
public class MyThreadB extends Thread {
    /*volatile*/  public static int count;//使用synchronized后也就没必要用volatile了
    synchronized private static void   addCount(){
        for(int i=0;i<100;i++){
            count++;
        }
        System.out.println("count:"+count);
    }
    @Override
    public void run() {
        super.run();
        addCount();
    }

    public static void main(String[] args) {
        MyThreadB[] myThreadArray=new MyThreadB[100];
        for (int i=0;i<100;i++){
            myThreadArray[i]=new MyThreadB();
        }
        for (int i=0;i<100;i++){
            myThreadArray[i].start();
        }
    }
}
