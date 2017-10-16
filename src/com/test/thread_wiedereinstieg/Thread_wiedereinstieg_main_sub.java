package com.test.thread_wiedereinstieg;

import com.threads.synchronized_Lock_wiedereinstieg.Sub;
import com.threads.synchronized_Lock_wiedereinstieg.Thread_Main_Sub;

/**
 * Created by K on 2017/10/10.
 */
/*子类是完全可以通过可重入锁 调用父类的同步方法的*/
public class Thread_wiedereinstieg_main_sub {
    public static void main(String[] args) {
        Sub sub=new Sub();
        Thread_Main_Sub thread_main_sub=new Thread_Main_Sub(sub);
        thread_main_sub.start();
    }
}
