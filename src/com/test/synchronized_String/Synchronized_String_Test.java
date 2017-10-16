package com.test.synchronized_String;

import com.threads.synchronized_String.Synchronized_String;

/**
 * Created by K on 2017/10/14.
 */
/**
 * JVM具有String常量池缓存的功能，将synchronized(String)同步代码块与String联合使用时，如果多个线程共用同一个字符串，则这线程持有相同的锁，所以一般不用String作为锁对象*/
public class Synchronized_String_Test {
    public static void main(String[] args) {
        Synchronized_String synchronized_string=new Synchronized_String();
        Thread threadA = new Thread("A") {
            @Override
            public void run() {
                super.run();
                synchronized_string.print("AA");
            }
        };
        Thread threadB = new Thread("B") {
            @Override
            public void run() {
                super.run();
                synchronized_string.print("AA");
            }
        };
        threadA.start();
        threadB.start();
//        threadA.interrupt();
    }
}
