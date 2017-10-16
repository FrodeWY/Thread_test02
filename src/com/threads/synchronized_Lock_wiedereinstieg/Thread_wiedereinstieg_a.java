package com.threads.synchronized_Lock_wiedereinstieg;

/**
 * Created by K on 2017/10/10.
 */
public class Thread_wiedereinstieg_a extends Thread {
    private Service service;

    public Thread_wiedereinstieg_a(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.service1();
    }
}
