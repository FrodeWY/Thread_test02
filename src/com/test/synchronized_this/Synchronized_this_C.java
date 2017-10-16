package com.test.synchronized_this;

import com.threads.synchronized_this.ObjectServiceB;

/**
 * Created by K on 2017/10/11.
 */
/**
 * synchronized(this)使用的“对象监视锁”只有一个，也是锁定当前对象，当一个线程访问object的一个synchronized(this)同步代码块时，
 * 其他线程对同一个Object中其他所有synchronized(this)同步代码块,或访问synchronize 方法的访问将被阻塞*/
public class Synchronized_this_C {

    public static void main(String[] args) {
        ObjectServiceB objectServiceB=new ObjectServiceB();
        Thread thread = new Thread(){
            @Override
            public void run() {
                super.run();
                objectServiceB.serviceMethodA();
            }
        };
        Thread thread1 = new Thread(){
            @Override
            public void run() {
                super.run();
                objectServiceB.serviceMethodB();
            }
        };
        Thread thread2 = new Thread(){
            @Override
            public void run() {
                super.run();
                objectServiceB.serviceMethod();
            }
        };
        thread.setName("A");
        thread1.setName("B");
        thread2.setName("C");
        thread.start();
        thread1.start();
        thread2.start();
    }

}

