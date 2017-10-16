package com.threads.thread_death;

/**
 * Created by K on 2017/10/14.
 */
/**
 * 设计程序时要避免双方互相持有对方的锁，只要互相等待对方的锁就有可能导致死锁*/
public class Thread_death implements Runnable{
    private String username;
    public Object lock1=new Object();
    public Object lock2=new Object();


    public void setFlag(String username) {
        this.username = username;
    }

    @Override
    public void run() {
        if(username.equals("a")){
            synchronized (lock1){
                System.out.println("username="+username+" ThreadName:"+Thread.currentThread().getName());
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2){
                    System.out.println("按lock1->lock2代码顺序执行");
                }
            }
        }if(username.equals("b")){
            synchronized (lock2){
                System.out.println("username="+username+" ThreadName:"+Thread.currentThread().getName());
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock1){
                    System.out.println("按lock2->lock1代码顺序执行");
                }
            }
        }

    }
}
