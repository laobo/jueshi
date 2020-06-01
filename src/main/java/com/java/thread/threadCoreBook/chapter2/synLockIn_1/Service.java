package com.java.thread.threadCoreBook.chapter2.synLockIn_1;

/**
 * Created by duanxiangchao on 2018/8/20
 */
public class Service {

    synchronized public void service1(){
        System.out.println("service1");
        service2();
    }

    synchronized public void service2(){
        System.out.println("service2");
        service3();
    }

    synchronized public void service3(){
        System.out.println("service3");
    }

}
