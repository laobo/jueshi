package com.java.thread.threadCoreBook.chapter1.suspendResumeTest;

/**
 * Created by duanxiangchao on 2018/8/14
 */
public class MyThread extends Thread {

    private long i = 0;

    @Override
    public void run() {
        while (true){
            i++;
        }
    }

    public long getI() {
        return i;
    }

    public void setI(long i) {
        this.i = i;
    }
}
