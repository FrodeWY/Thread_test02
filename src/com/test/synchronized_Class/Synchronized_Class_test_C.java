package com.test.synchronized_Class;

import com.threads.synchronized_Class.Service_classA;

/**
 * Created by K on 2017/10/12.
 */

/**
 * synchronized(class)代码块作用其实和synchronized static 方法的作用是一样的
 * */
public class Synchronized_Class_test_C
{
    public static void main(String[] args) {
        Service_classA classA = new Service_classA();
        Service_classA classB = new Service_classA();
        Thread threadA = new Thread(){
            @Override
            public void run() {
                super.run();
                classA.printA();
            }
        };
        Thread threadB = new Thread(){
            @Override
            public void run() {
                super.run();
                classB.printD();
            }
        };

        threadA.setName("A");
        threadB.setName("B");
        threadA.start();
        threadB.start();
    }
}
