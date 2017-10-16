package com.threads.part_or_global_variate;

/**
 * Created by K on 2017/10/10.
 */
public class Thread_globalVariate_a extends Thread {
    private GlobalVariate globalVariate;

    public Thread_globalVariate_a(GlobalVariate globalVariate) {
        this.globalVariate = globalVariate;
    }

    @Override
    public void run() {
        super.run();
        globalVariate.addI("a");
    }
}
