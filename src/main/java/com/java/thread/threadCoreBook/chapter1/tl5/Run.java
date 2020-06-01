package com.java.thread.threadCoreBook.chapter1.tl5;

/**
 * Created by duanxiangchao on 2018/8/14
 */
public class Run {

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        thread.interrupt();
        System.out.println("end!");
    }

}
