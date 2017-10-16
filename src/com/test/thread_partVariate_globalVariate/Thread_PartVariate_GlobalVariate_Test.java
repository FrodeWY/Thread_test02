package com.test.thread_partVariate_globalVariate;

/**
 * Created by K on 2017/10/10.
 */

import com.threads.part_or_global_variate.*;

/**
 * 局部变量与实例变量的线程安全
 * 方法内的变量（局部变量）为线程安全的
 * 实例变量为线程不安全的*/
public class Thread_PartVariate_GlobalVariate_Test {
    public static void main(String[] args) {
        /*方法内的变量（局部变量）为线程安全的*/

       /* PartVariate partVariate=new PartVariate();
        Thread_partVariate_a thread_partVariate_a=new Thread_partVariate_a(partVariate);
        Thread_partVariate_b thread_partVariate_b=new Thread_partVariate_b(partVariate);
        thread_partVariate_a.start();
        thread_partVariate_b.start();*/

        /*单例模式中实例变量为线程不安全的*/

        /*  GlobalVariate globalVariate=new GlobalVariate();
        Thread_globalVariate_a thread_globalVariate_a=new Thread_globalVariate_a(globalVariate);
        Thread_globalVariate_b thread_globalVariate_b = new Thread_globalVariate_b(globalVariate);
        thread_globalVariate_a.start();
        thread_globalVariate_b.start();*/

        /*给方法上同步锁synchronized,实现线程安全，多个线程访问同一个对象，哪个线程先执行，则哪个线程先得到属于对象的lock，其他线程只能呈等待状态，运行是同步的
        * synchronized 取得的锁是对象锁，而不是把一段代码或方法当作锁*/
        /*GlobalVariate globalVariate1=new GlobalVariate();
        Thread_GlobalVariate_1 thread_globalVariate_1=new Thread_GlobalVariate_1(globalVariate1);
        Thread_GlobalVariate_2 thread_globalVariate_2=new Thread_GlobalVariate_2(globalVariate1);
        thread_globalVariate_1.start();
        thread_globalVariate_2.start();*/

        /*当多个线程访问多个对象时，则jvm会创建多个锁，则运行是异步的*/
        GlobalVariate globalVariate2=new GlobalVariate();
        GlobalVariate globalVariate3=new GlobalVariate();
        Thread_GlobalVariate_1 thread_globalVariate_2a=new Thread_GlobalVariate_1(globalVariate2);
        Thread_GlobalVariate_2 thread_globalVariate_3b=new Thread_GlobalVariate_2(globalVariate3);
        thread_globalVariate_2a.start();
        thread_globalVariate_3b.start();

    }
}
