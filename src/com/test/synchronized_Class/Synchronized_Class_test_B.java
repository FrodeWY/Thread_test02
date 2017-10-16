package com.test.synchronized_Class;

import com.threads.synchronized_Class.Service_classA;

/**
 * Created by K on 2017/10/12.
 */

/**
 * 静态同步锁是给class上锁，而synchronized加到非静态方法则是给对象上锁，不是同一把锁
 * 对象锁针对同一对象的synchronized方法或synchronized(this){}起作用,呈同步运行
 * class锁针对类的所有对象的synchronized方法或synchronized(this){}起作用,呈同步运行
 * */
public class Synchronized_Class_test_B
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
                classB.printB();
            }
        };

        threadA.setName("A");
        threadB.setName("B");
        threadA.start();
        threadB.start();
    }
}
