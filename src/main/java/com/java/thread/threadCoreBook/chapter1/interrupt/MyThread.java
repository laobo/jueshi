package com.java.thread.threadCoreBook.chapter1.interrupt;

/**
 * Created by duanxiangchao on 2018/8/13
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        for(int i=0; i<300000; i++){
            System.out.println("i=" + (i + 1));
        }
    }
}
