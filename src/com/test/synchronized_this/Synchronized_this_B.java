package com.test.synchronized_this;

import com.threads.synchronized_this.Task;

/**
 * Created by K on 2017/10/11.
 */
/**
 *进入 synchronized(this)之前是异步执行，在synchronized(this)中就是同步执行*/
public class Synchronized_this_B {
    public static void main(String[] args) {
        Task task=new Task();
        Thread threadA = new Thread(){
            @Override
            public void run() {
                task.doLongTimeTask();
            }
        };
        Thread threadB = new Thread(){
            @Override
            public void run() {
                task.doLongTimeTask();
            }
        };
        threadA.setName("A");
        threadB.setName("B");
        threadA.start();
        threadB.start();
    }
}
