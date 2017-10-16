package com.threads.thread_volatile;

/**
 * Created by K on 2017/10/16.
 */
/**
 * 停不下来的原因主要是main线程一直在处理while()循环，导致程序不能继续执行后面的代码，解决办法当然是用多线程*/
public class PrintString {
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

    public static void main(String[] args) {
        PrintString printString=new PrintString();
        printString.printStringMethod();
        System.out.println("我要停止它！stopThread="+Thread.currentThread().getName());
        printString.setContinuePrint(false);

    }
}
