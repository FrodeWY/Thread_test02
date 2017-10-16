package com.threads.synchronized_Lock;

/**
 * Created by K on 2017/10/10.
 */
public class Thread_a2 extends Thread{
    private MyObject_a myObject_a;

    public Thread_a2(MyObject_a myObject_a) {
        this.myObject_a = myObject_a;
    }

    @Override
    public void run() {
        super.run();
        myObject_a.methodB();
    }
}
