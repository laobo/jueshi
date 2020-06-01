package com.java.thread.threadCoreBook.chapter1.supend_resume_deal_lock;

/**
 * Created by duanxiangchao on 2018/8/15
 */
public class SynchronizedObject {

    synchronized public void printString(){
        System.out.println("begin");
        if(Thread.currentThread().getName().equals("a")){
            System.out.println("a线程永远suspend了");
            Thread.currentThread().suspend();
        }
        System.out.println("end");
    }

}
