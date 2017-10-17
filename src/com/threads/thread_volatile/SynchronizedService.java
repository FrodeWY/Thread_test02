package com.threads.thread_volatile;


import com.threads.synchronized_Lock_wiedereinstieg.Service;

/**
 * Created by K on 2017/10/17.
 */
public class SynchronizedService extends Thread {
    private boolean flag=true;
    public void runMethod(){

//        synchronized (this) {
        while (flag) {
            /*synchronized不仅可以解决一个线程看到对象处于不一致的状态，还可以保证进入同步方法或者同步代码块的每个线程，
            都可以看到有同一个锁保护之前的所有的修改效果*/
            synchronized (new String()){}
        }
//        }
        System.out.println("停下来了");
    }
    public void stopMethod(){
        flag=false;
    }

    @Override
    public void run() {
        super.run();
        runMethod();
    }

    public static void main(String[] args) throws InterruptedException {
        SynchronizedService service=new SynchronizedService();
        Thread threadA=new Thread(service);
        Thread threadB=new Thread(){
            @Override
            public void run() {
                super.run();
                service.stopMethod();
            }
        };
        threadA.start();
        Thread.sleep(1000);
//        service.stopMethod();
        threadB.start();
        System.out.println("已将发起停止命令");


    }
}
