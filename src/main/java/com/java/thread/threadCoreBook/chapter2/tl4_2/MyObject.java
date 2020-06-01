package com.java.thread.threadCoreBook.chapter2.tl4_2;

/**
 * Created by duanxiangchao on 2018/8/20
 */
public class MyObject {

    synchronized public void methodA(){
        try {
            System.out.println("begin methodA threadName=" + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end endTime=" + System.currentTimeMillis());
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void methodB(){
        try {
            System.out.println("begin methodB threadName=" + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end");
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
