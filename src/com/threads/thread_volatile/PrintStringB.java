package com.threads.thread_volatile;

/**
 * Created by K on 2017/10/16.
 */
/**
 * 使用多线程分别执行，使程序停止，但此处的代码格式，一旦运行在-server服务器模式中64bit的JVM上时，会出现死循环。解决方法：使用volatile关键字。*/
public class PrintStringB implements Runnable{
    private boolean isContinuePrint = true;

    public boolean isContinuePrint() {
        return isContinuePrint;
    }

    public void setContinuePrint(boolean continuePrint) {
        isContinuePrint = continuePrint;
    }
    public void printStringMethod(){
        while (isContinuePrint){
            System.out.println("run printStringMethod threadName="+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    @Override
    public void run() {
        printStringMethod();
    }
    public static void main(String[] args) {
        PrintStringB printString=new PrintStringB();
        Thread thread = new Thread(printString,"B");
        thread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("我要停止它！stopThread="+Thread.currentThread().getName());
        printString.setContinuePrint(false);

    }
}
