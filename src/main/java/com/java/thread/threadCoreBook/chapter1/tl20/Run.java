package com.java.thread.threadCoreBook.chapter1.tl20;

/**
 * Created by duanxiangchao on 2018/8/17
 */
public class Run {

    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.setDaemon(true);
            myThread.start();
            Thread.sleep(50000);
            System.out.println("我离开thread对象也不在答应了，也就是停止了！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
