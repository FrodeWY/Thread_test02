package com.test.synchronized_this;

import com.threads.synchronized_this.ObjectService;
import com.threads.synchronized_this.ThreadA;
import com.threads.synchronized_this.ThreadB;

/**
 * Created by K on 2017/10/11.
 */
/**
 * 当一个线程访问object的一个synchronized同步代码块时，另一个线程仍然可以访问该object对象的非synchronized(this)同步代码块*/
public class Synchronized_this_A {
    public static void main(String[] args) {
        ObjectService objectService = new ObjectService();
        ThreadA threadA = new ThreadA(objectService);
        threadA.setName("A");
        ThreadB threadB = new ThreadB(objectService);
        threadB.setName("B");
        threadA.start();
        threadB.start();
    }
}
