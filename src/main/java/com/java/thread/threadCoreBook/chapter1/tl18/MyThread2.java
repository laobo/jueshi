package com.java.thread.threadCoreBook.chapter1.tl18;

/**
 * Created by duanxiangchao on 2018/8/15
 */
public class MyThread2 extends Thread {

    @Override
    public void run() {
        System.out.println("MyThread2 run priority=" + this.getPriority());
    }
}
