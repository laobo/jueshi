package com.java.thread.threadCoreBook.chapter1.tl18;

/**
 * Created by duanxiangchao on 2018/8/15
 */
public class Run {

    public static void main(String[] args) {

        System.out.println("main thread begin priority=" + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(6);
        System.out.println("main thread end priority=" + Thread.currentThread().getPriority());
        MyThread1 mythread1 = new MyThread1();
        mythread1.start();

    }

}
