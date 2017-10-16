package com.test.synchronized_Object;

import com.threads.synchronized_object.Synchronized_Object;

/**
 * Created by K on 2017/10/12.
 */
/**
 * 多个对象监视器，代码呈异步执行*/
public class Synchronized_Object_test_A2 {


    public static void main(String[] args) {
         Synchronized_Object synchronized_object=new Synchronized_Object();
         Object objectA=new Object();
         Object objectB=new Object();
        Thread threadA = new Thread(){
            @Override
            public void run() {
                super.run();
                synchronized_object.testMethodA(objectA);
            }
        };
        Thread threadB = new Thread(){
            @Override
            public void run() {
                super.run();
                synchronized_object.testMethodA(objectB);
            }
        };
        threadA.setName("A");
        threadB.setName("B");
        threadA.start();
        threadB.start();
    }
}
