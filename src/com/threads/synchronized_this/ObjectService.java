package com.threads.synchronized_this;

/**
 * Created by K on 2017/10/11.
 */
public class ObjectService {
    private String getData1;
    private String getData2;
    public void serviceMethod(){
        try {
            System.out.println("Begin Task");
            Thread.sleep(5000);
            String privateGetData1="长时间处理任务后反回的值1 threadName="+Thread.currentThread().getName();
            String privateGetData2 = "长时间处理任务后反回的值1 threadName=" + Thread.currentThread().getName();
            synchronized (this){
                getData1=privateGetData1;
                getData2=privateGetData2;
            }
            System.out.println(getData1);
            System.out.println(getData2);
            System.out.println("end task");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
