package com.threads.thread_volatile;

/**
 * Created by K on 2017/10/16.
 */
/*JVM有两种运行模式Server与Client。两种模式的区别在于，Client模式启动速度较快，Server模式启动较慢；但是启动进入稳定期长期运行之后Server模式的程序运行速度比Client要快很多。
这是因为Server模式启动的JVM采用的是重量级的虚拟机，对程序采用了更多的优化；而Client模式启动的JVM采用的是轻量级的虚拟机。所以Server启动慢，但稳定后速度比Client远远要快。
注：如果要切换启动模式，首先要确认JDK支持哪一种或两种模式。查看JAVA_HOME/jre/bin目录下是否存在client或server目录。
32位的JDK一般都支持server和client两种模式。64位的虚拟机好像只支持server模式，没有client目录*/
/**
 *1、声明变量siRunable时，存于公共堆栈和线程的私有堆栈里，在JVM被设置为-server模式是为了线程的运行效率，线程一直在私有堆栈中取得isRunnable的值是true。而代码thread.setRunning(false),
 * 虽被执行，更新的却是公共堆栈中的isRunnable变量值false,所以一直就是死循环状态
 * 2、使用volatile，它主要的作用是当线程访问isRunnable这个变量时，强制性从公共堆栈中进行取值*/
public class RunThread extends Thread {

    volatile private boolean isRunable=true;//关键字volatile解决的是变量在多个线程之间的可见性，并不能保证原子性，也就是线程非安全，而synchronized解决的是多个线程之间的访问资源的同步性（可见性，原子性）

    public boolean isRunable() {
        return isRunable;
    }

    public void setRunable(boolean runable) {
        isRunable = runable;
    }

    @Override
    public void run() {
        super.run();
        System.out.println("进入run");
        while (isRunable){
        }
        System.out.println("线程被停止了");
    }

    public static void main(String[] args) {
        RunThread runThread = new RunThread();
        runThread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        runThread.setRunable(false);
        System.out.println("已经赋值为false");
    }
    /*volatile和synchronized的比较：
    * 1.volatile 是线程同步的轻量级实现，所以volatile性能肯定比synchronized要好，且volatile只能修饰于变量，而synchronized可以修饰方法，及代码块。随着jdk新版本的发布，synchronized
    * 在执行效率上得到了很大提高，在开发中的使用变多
    * 2.多线程访问volatile不会发生阻塞，而synchronized会发生阻塞
    * 3.volatile能保证数据的可见性，但不能保证原子性；而synchronized可以保证原子性和可见性，因为他会将私有内存和公共内存中的数据做同步
    * 4.volatile解决的是变量再多个线程之间的可见性，而synchronized解决的是多个线程之间访问资源的同步性
    * 5.线程安全包含原子性和可见性，java的同步机制就是围绕这两方面进行的*/
}
