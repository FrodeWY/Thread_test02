package com.threads.atomic_class;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by K on 2017/10/17.
 */
/**
 * 原子类：可以实现i++时同步操作，原子操作是不能分割的整体，没有其他线程能够终端或者检查正在原子操作的变量，它可以在没有锁的情况下做到线程安全*/
public class AtomicClass extends Thread {
    private AtomicInteger count=new AtomicInteger();

    @Override
    public void run() {
        super.run();
        for (int i=0;i<10000;i++){
            System.out.println(count.incrementAndGet());
        }
    }

    public static void main(String[] args) {
        AtomicClass atomicClass=new AtomicClass();
        Thread[]threads=new Thread[5];

        for(int i=0;i<5;i++){
            threads[i]=new Thread(atomicClass);
        }
        for(int i=0;i<threads.length;i++){
            threads[i].start();
        }
    }
}
