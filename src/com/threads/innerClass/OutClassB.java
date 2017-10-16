package com.threads.innerClass;

/**
 * Created by K on 2017/10/14.
 */
/*内置类和普通类一样，如果锁被其他对象作为对象监视器使用则其他线程只能以同步的方式访问该类的同步方法*/
public class OutClassB {
    static class InnerB{
        public void method1(InnerC innerC){
            String threadName=Thread.currentThread().getName();
            synchronized (innerC){
                System.out.println(threadName +"进入InnerB 中的method1方法 ");
                for (int i=1;i<10;i++){
                    System.out.println("i="+ i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(threadName+ "离开InnerB中的method1方法");
            }
        }

        synchronized   public void method2(){
            String threadName=Thread.currentThread().getName();
            System.out.println(threadName +"进入InnerB 中的method2方法 ");
            for (int i=1;i<10;i++){
                System.out.println("j="+ i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(threadName+ "离开InnerB中的method2方法");

        }
    }
    static class InnerC{
        synchronized   public void method(){
            String threadName=Thread.currentThread().getName();
            System.out.println(threadName +"进入InnerC 中的method方法 ");
            for (int i=1;i<10;i++){
                System.out.println("k="+ i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(threadName+ "离开InnerC中的method方法");

        }
    }

    public static void main(String[] args) {
        final InnerB innerB=new InnerB();
        final InnerC innerC=new InnerC();
        Thread tb=new Thread("b"){
            @Override
            public void run() {
                super.run();
                innerB.method1(innerC);
            }
        };
        Thread tb2=new Thread("b2"){
            @Override
            public void run() {
                super.run();
                innerB.method2();
            }
        };
        Thread tc=new Thread("c"){
            @Override
            public void run() {
                super.run();
                innerC.method();
            }
        };
        tb.start();
        tb2.start();
        tc.start();
    }
}
