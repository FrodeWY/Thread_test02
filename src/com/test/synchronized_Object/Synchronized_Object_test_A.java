package com.test.synchronized_Object;

import com.threads.synchronized_object.Synchronized_Object;

/**
 * Created by K on 2017/10/12.
 */
/**
 * 使用同一个对象监控器，则同步运行，结论：当多个线程同时执行synchronized(X){}同步代码块呈同步效果*/
public class Synchronized_Object_test_A {


    public static void main(String[] args) {
         Synchronized_Object synchronized_object=new Synchronized_Object();
         Object object=new Object();
        Thread threadA = new Thread(){
            @Override
            public void run() {
                super.run();
                synchronized_object.testMethodA(object);
            }
        };
        Thread threadB = new Thread(){
            @Override
            public void run() {
                super.run();
                synchronized_object.testMethodA(object);
            }
        };
        threadA.setName("A");
        threadB.setName("B");
        threadA.start();
        threadB.start();
    }
}
