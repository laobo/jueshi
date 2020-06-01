package com.java.thread.threadCoreBook.chapter1.interrupt;

/**
 * Created by duanxiangchao on 2018/8/13
 */
public class Run3 {

    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.interrupt();
            System.out.println("是否停止1？=" + thread.isInterrupted());
            System.out.println("是否停止2？=" + thread.isInterrupted());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }

}
