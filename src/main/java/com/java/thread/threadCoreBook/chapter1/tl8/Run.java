package com.java.thread.threadCoreBook.chapter1.tl8;

/**
 * Created by duanxiangchao on 2018/8/14
 */
public class Run {

    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(2000);
            thread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
