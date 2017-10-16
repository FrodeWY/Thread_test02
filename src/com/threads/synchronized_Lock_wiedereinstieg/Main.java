package com.threads.synchronized_Lock_wiedereinstieg;

/**
 * Created by K on 2017/10/10.
 */
public class Main {
    public int i=10;
    synchronized public void operateMainMethod(){
        try {
            i--;
            System.out.println("main print i="+i);
            Thread.sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
