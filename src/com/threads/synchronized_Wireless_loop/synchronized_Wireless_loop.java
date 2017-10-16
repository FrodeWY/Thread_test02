package com.threads.synchronized_Wireless_loop;

/**
 * Created by K on 2017/10/14.
 */
public class synchronized_Wireless_loop {
    synchronized public void methodA(){
        System.out.println("methodA begin");
        boolean flag=true;
        while (flag){
        }
        System.out.println("methodA end");
    }
    synchronized public void methodB(){
        System.out.println("methodB begin");
        System.out.println("methodB end");
    }
}
