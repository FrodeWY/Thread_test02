package com.threads.part_or_global_variate;

/**
 * Created by K on 2017/10/10.
 */
public class Thread_partVariate_a extends Thread {
    private PartVariate partVariate;

    public Thread_partVariate_a(PartVariate partVariate) {
        this.partVariate = partVariate;
    }

    @Override
    public void run() {
        super.run();
        partVariate.addI("a");
    }
}
