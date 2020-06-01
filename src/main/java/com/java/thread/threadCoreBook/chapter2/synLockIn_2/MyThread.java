package com.java.thread.threadCoreBook.chapter2.synLockIn_2;

/**
 * Created by duanxiangchao on 2018/8/20
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        Sub sub = new Sub();
        sub.operatISubMethod();
    }
}
