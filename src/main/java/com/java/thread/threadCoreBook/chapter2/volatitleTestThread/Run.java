package com.java.thread.threadCoreBook.chapter2.volatitleTestThread;

/**
 * Created by duanxiangchao on 2018/9/14
 */
public class Run {

    public static void main(String[] args) {

        MyThread[] myThreads = new MyThread[100];
        for(int i = 0; i < 100; i++){
            myThreads[i] = new MyThread();
        }

        for(int i = 0; i < 100; i++){
            myThreads[i] .start();
        }

    }

}
