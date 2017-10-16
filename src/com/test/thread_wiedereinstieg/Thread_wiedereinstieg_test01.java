package com.test.thread_wiedereinstieg;

import com.threads.synchronized_Lock_wiedereinstieg.Service;
import com.threads.synchronized_Lock_wiedereinstieg.Thread_wiedereinstieg_a;

/**
 * Created by K on 2017/10/10.
 */
/*可重入锁：自己可以再次获取到自己的内部锁，例如有一个线程获得了某个对象的锁，此时这个对象锁还没有释放，
当其想再次获得这个对象的锁时还是可以获取的，如果不可以锁重入的话，就会造成死锁*/
public class Thread_wiedereinstieg_test01 {
    public static void main(String[] args) {
        Service service=new Service();
        Thread_wiedereinstieg_a thread_wiedereinstieg_a=new Thread_wiedereinstieg_a(service);
        thread_wiedereinstieg_a.start();
    }
}
