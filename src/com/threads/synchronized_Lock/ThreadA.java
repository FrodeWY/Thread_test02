package com.threads.synchronized_Lock;

/**
 * Created by K on 2017/10/10.
 */
public class ThreadA extends Thread {
    private MyObjectA myObjectA;

    public ThreadA(MyObjectA myObjectA) {
        this.myObjectA = myObjectA;
    }

    @Override
    public void run() {
        super.run();
        myObjectA.methodA();
    }
}
