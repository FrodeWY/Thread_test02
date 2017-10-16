package com.threads.part_or_global_variate;

/**
 * Created by K on 2017/10/10.
 */
public class GlobalVariate {
    private  int num=0;
    public void addI(String username){
        try {
            if(username.equals("a")){
                num=100;
                System.out.println("a set over");
                Thread.sleep(2000);
            }
            if(username.equals("b")){
                num=200;
                System.out.println("b set over");
                Thread.sleep(2000);
            }
            System.out.println(username+"   num="+num);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    synchronized public void addII(String username){
        try {
            if(username.equals("a")){
                num=100;
                System.out.println("a set over");
                Thread.sleep(2000);
            }
            if(username.equals("b")){
                num=200;
                System.out.println("b set over");
                Thread.sleep(2000);
            }
            System.out.println(username+"   num="+num);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
