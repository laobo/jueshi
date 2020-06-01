package com.java.thread.threadCoreBook.chapter2.t16;

/**
 * Created by duanxiangchao on 2018/9/14
 */
public class Run {


    public static void main(String[] args) {
        RunThread runThread = new RunThread();
        runThread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        runThread.setRunning(false);
        System.out.println("已经赋值为false");
    }


}
