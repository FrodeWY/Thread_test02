package com.threads.innerClass;

/**
 * Created by K on 2017/10/14.
 */
public class StaticRun {
    public static void main(String[] args) {
        PublicClass publicClass=new PublicClass();
        publicClass.setPassword("passwordValue");
        publicClass.setUsername("userName");
        System.out.println(publicClass.getUsername()+":  "+publicClass.getPassword());
        PublicStaticClass.privateClass privateClass=new PublicStaticClass.privateClass();
        privateClass.setAddress("addressValue");
        privateClass.setAge("ageValue");
        System.out.println(privateClass.getAddress()+"  "+privateClass.getAge());
    }
}
