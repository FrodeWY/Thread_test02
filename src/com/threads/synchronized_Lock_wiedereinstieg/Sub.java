package com.threads.synchronized_Lock_wiedereinstieg;

/**
 * Created by K on 2017/10/10.
 */
public class Sub extends Main {
    synchronized  public void  operateSubMethod(){
        try {
            while (i>0){
                i--;
                System.out.println("sub print i="+i);
                Thread.sleep(100);
                this.operateMainMethod();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
