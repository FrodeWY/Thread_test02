package com.test.synchronized_String;

import com.threads.synchronized_String.Synchronized_Object;

/**
 * Created by K on 2017/10/14.
 */
/*new Object()实例化一个对象，但是他不放入缓存，所以锁不是一个*/
public class Synchronized_String_TestB {
    public static void main(String[] args) {
        Synchronized_Object synchronized_object = new Synchronized_Object();
        Thread threadA = new Thread("A"){
            @Override
            public void run() {
                super.run();
                synchronized_object.print(new Object());
            }
        };
        Thread threadB = new Thread("B"){
            @Override
            public void run() {
                super.run();
                synchronized_object.print(new Object());
            }
        };
        threadA.start();
        threadB.start();
    }
}
