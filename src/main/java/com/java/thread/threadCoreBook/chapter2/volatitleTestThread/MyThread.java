package com.java.thread.threadCoreBook.chapter2.volatitleTestThread;

/**
 * Created by duanxiangchao on 2018/9/14
 */
public class MyThread extends Thread {

    volatile public static int count;

    synchronized private static void addCount(){

        for(int i = 0; i < 1000; i++){
            count++;
        }
        System.out.println("count=" + count);
    }

    @Override
    public void run() {
        addCount();
    }
}
