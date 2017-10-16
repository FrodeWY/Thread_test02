package com.threads.innerClass;

/**
 * Created by K on 2017/10/14.
 */
public class OutClass {
    static class Inner{
        public void method1(){
            synchronized ("other"){
                for (int i=1;i<10;i++){
                    System.out.println(Thread.currentThread().getName()+"  i="+i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        public synchronized  void method2(){
            for (int j=1;j<10;j++){
                System.out.println(Thread.currentThread().getName()+"  j="+j);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        final Inner inner=new Inner();
        Thread t1=new Thread("t1"){
            @Override
            public void run() {
                super.run();
                inner.method1();
            }
        };
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                inner.method2();
            }
        },"t2");
        t1.start();
        t2.start();
    }
}
