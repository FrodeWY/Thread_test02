package com.test.thread_syn_lock;

import com.threads.synchronized_Lock.MyObject_a;
import com.threads.synchronized_Lock.Thread_a1;
import com.threads.synchronized_Lock.Thread_a2;
import com.threads.synchronized_Lock.Thread_a3;

/**
 * Created by K on 2017/10/10.
 */
/**
 * A线程先持有myObject对象的Lock锁，B线程可以异步调用myObject对象里的非synchronized类型的方法
 * C线程调用myObject对象里的synchronized类型方法需要等待A线程释放Lock,也就是同步*/
public class Thread_Syn_Lock_b {
    public static void main(String[] args) {
        MyObject_a myObject_a=new MyObject_a();
        Thread_a1 thread_a1 = new Thread_a1(myObject_a);
        Thread_a2 thread_a2 =new Thread_a2(myObject_a);
        Thread_a3 thread_a3=new Thread_a3(myObject_a);
        thread_a1.setName("A");
        thread_a2.setName("B");
        thread_a3.setName("C");
        thread_a1.start();
        thread_a2.start();
        thread_a3.start();

    }
}
