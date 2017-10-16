package com.test.synchronized_Class;

import com.threads.synchronized_Class.Service_classA;

/**
 * Created by K on 2017/10/12.
 */
/**
 * 静态同步锁是给class上锁，而synchronized加到非静态方法则是给对象上锁，不是同一把锁;ThreadC异步执行的原因：ThreadC是对象锁，ThreadA,B是class锁，不是一把锁
 * 对象锁针对同一对象的synchronized方法或synchronized(this){},呈同步运行
 * */
public class Synchronized_Class_test_A
{
    public static void main(String[] args) {
        Service_classA classA = new Service_classA();
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
                classA.printB();
            }
        };
        Thread threadC = new Thread(){
            @Override
            public void run() {
                super.run();
                classA.printC();
            }
        };
        threadA.setName("A");
        threadB.setName("B");
        threadC.setName("C");
        threadA.start();
//        threadB.start();
        threadC.start();
    }
}
