package com.java.thread.threadCoreBook.chapter1.tl17;

/**
 * Created by duanxiangchao on 2018/8/15
 */
public class MyThread extends Thread {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }

    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        int count = 0;
        for(int i = 0; i < 5000000; i++){
            Thread.yield();
            count = count + (i + 1);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("用时：" + (endTime - beginTime) + "毫秒");
    }
}
