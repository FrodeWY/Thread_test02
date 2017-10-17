package com.threads.atomic_class;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by K on 2017/10/17.
 */

/**
 *  结果：打印顺序出错了，是因为addAndGet()方法是原子性的，但方法之间的调用却不是原子的，解决这样的问题要用同步*/
public class AtomicClassB extends Thread {
    private static AtomicInteger count=new AtomicInteger();

    public static AtomicInteger getCount() {
        return count;
    }

    public void addNum(){
        System.out.println(Thread.currentThread().getName()+"加上100之后的值是"+count.addAndGet(100));
        count.addAndGet(1);
    }
    synchronized public void addNumB(){
        System.out.println(Thread.currentThread().getName()+"加上100之后的值是"+count.addAndGet(100));
        count.addAndGet(1);
    }
    @Override
    public void run() {
        super.run();
       addNum();
//        addNumB();
    }

    public static void main(String[] args) throws InterruptedException {
        AtomicClassB atomicClass=new AtomicClassB();
        Thread[]threads=new Thread[5];

        for(int i=0;i<5;i++){
            threads[i]=new Thread(atomicClass);
        }
        for(int i=0;i<threads.length;i++){
            threads[i].start();
        }
        Thread.sleep(1000);
        System.out.println(atomicClass.getCount());
    }
}
