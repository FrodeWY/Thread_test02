package com.threads.synchronized_Lock_wiedereinstieg;

/**
 * Created by K on 2017/10/10.
 */
public class Service {
    synchronized public void  service1(){
        System.out.println("service1");
        service2();
    }
    synchronized public void  service2(){
        System.out.println("service2");
        service3();
    }
    synchronized public void  service3(){
        System.out.println("service3");

    }
}
