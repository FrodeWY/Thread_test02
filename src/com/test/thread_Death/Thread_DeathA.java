package com.test.thread_Death;

import com.threads.thread_death.Thread_death;

/**
 * Created by K on 2017/10/14.
 */
/**
 * 设计程序时要避免双方互相持有对方的锁，只要互相等待对方的锁就有可能导致死锁*/
public class Thread_DeathA {
    public static void main(String[] args) throws InterruptedException {
        Thread_death threadDeathA=new Thread_death();
        threadDeathA.setFlag("a");
        Thread thread1=new Thread(threadDeathA);
        Thread thread2=new Thread(threadDeathA);
        thread1.start();
        Thread.sleep(100);
        threadDeathA.setFlag("b");
        thread2.start();
    }
}
