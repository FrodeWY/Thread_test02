package com.test.synchronized_Object;

import com.threads.synchronized_object.Service;
import com.threads.synchronized_object.Synchronized_ObjectB;

/**
 * Created by K on 2017/10/12.
 */

/**
 * 结论：当其他线程执行X对象的synchronized(this){}同步方法时呈同步效果,本质上因为一个对象只有一个lock，
 * 当X对象被A对象作为对象监视器时，则其Lock被A对象占用，则调用其synchronized方法或同步代码块时都需等待lock的释放*/
public class Synchronized_Object_test_C {
    public static void main(String[] args) {
        Synchronized_ObjectB objectB = new Synchronized_ObjectB();
        Service service = new Service();
        Thread threadA = new Thread(){
            @Override
            public void run() {
                super.run();
                service.testMethod1(objectB);
            }
        };
        threadA.setName("A");
        threadA.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread threadB = new Thread(){
            @Override
            public void run() {
                super.run();
                objectB.speedPrintStringB();
            }
        };
        threadB.setName("B");
        threadB.start();

    }
}
