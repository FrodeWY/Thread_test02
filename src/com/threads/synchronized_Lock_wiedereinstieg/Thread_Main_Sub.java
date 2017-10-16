package com.threads.synchronized_Lock_wiedereinstieg;

/**
 * Created by K on 2017/10/10.
 */
public class Thread_Main_Sub extends  Thread {
    private Sub sub;

    public Thread_Main_Sub(Sub sub) {
        this.sub = sub;
    }

    @Override
    public void run() {
        super.run();
        sub.operateSubMethod();
    }
}
