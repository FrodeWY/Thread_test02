package com.threads.synchronized_Lock;

/**
 * Created by K on 2017/10/10.
 */
public class ThreadB extends Thread{
    private MyObjectB myObjectB;

    public ThreadB(MyObjectB myObjectB) {
        this.myObjectB = myObjectB;
    }

    @Override
    public void run() {
        super.run();
        myObjectB.methodB();
    }
}
