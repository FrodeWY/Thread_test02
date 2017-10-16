package com.test.thread_syn_lock;

import com.threads.synchronized_Lock.MyObjectA;
import com.threads.synchronized_Lock.MyObjectB;
import com.threads.synchronized_Lock.ThreadA;
import com.threads.synchronized_Lock.ThreadB;

/**
 * Created by K on 2017/10/10.
 */
/**
 * 没有上同步锁synchronized 的方法可以同时进去
 * 出现异常锁自动释放*/
public class Thread_Syn_Lock {
    public static void main(String[] args) {
        /*没有上同步锁synchronized 的方法可以同时进去*/
       /* MyObjectA myObjectA=new MyObjectA();
        ThreadA threadA=new ThreadA(myObjectA);
        ThreadA threadB=new ThreadA(myObjectA);
        threadA.setName("A");
        threadB.setName("B");
        threadA.start();
        threadB.start();*/
/*上同步锁synchronized 的方法可以一定是排队进行的*/
        MyObjectB myObjectB=new MyObjectB();
        ThreadB threadB1=new ThreadB(myObjectB);
        ThreadB threadB2 = new ThreadB(myObjectB);
        threadB1.setName("B1");
        threadB2.setName("B2");
        threadB1.start();
        threadB2.start();
    }
}
