package com.threads.synchronized_this;

/**
 * Created by K on 2017/10/11.
 */
/**
 *进入 synchronized(this)之前是异步执行，在synchronized(this)中就是同步执行*/
public class Task {
    public void doLongTimeTask(){
        for(int i=0;i<100;i++){
            System.out.println("noSynchronized ThreadName:"+Thread.currentThread().getName()+"="+i);
        }
        System.out.println("----------------------");
        synchronized (this){
            for(int i=0;i<100;i++){
                System.out.println("Synchronized ThreadName:"+Thread.currentThread().getName()+"="+i);
            }
        }
    }
}
