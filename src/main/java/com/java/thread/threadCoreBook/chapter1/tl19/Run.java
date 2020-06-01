package com.java.thread.threadCoreBook.chapter1.tl19;

import com.java.thread.threadCoreBook.chapter1.MyThread;

/**
 * Created by duanxiangchao on 2018/8/15
 */
public class Run {

    public static void main(String[] args) {
        for(int i = 0; i < 20; i++){
            MyThread1 myThread1 = new MyThread1();
            myThread1.setPriority(1);
            MyThread2 myThread2 = new MyThread2();
            myThread2.setPriority(10);

            myThread1.start();
            myThread2.start();

        }
    }

}
