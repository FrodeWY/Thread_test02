package com.test.synchronized_Object;

import com.threads.synchronized_object.Service;
import com.threads.synchronized_object.Synchronized_ObjectB;

/**
 * Created by K on 2017/10/12.
 */
/**
 * 结论：当其他线程执行X对象的synchronized同步方法时呈同步效果*/
public class Synchronized_Object_test_B {
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
                objectB.speedPrintString();
            }
        };
        threadB.setName("B");
        threadB.start();
    }
}
