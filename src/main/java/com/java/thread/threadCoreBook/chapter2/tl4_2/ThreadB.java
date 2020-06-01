package com.java.thread.threadCoreBook.chapter2.tl4_2;

/**
 * Created by duanxiangchao on 2018/8/20
 */
public class ThreadB extends Thread {

    private MyObject myObject;

    public ThreadB(MyObject myObject){
        this.myObject = myObject;
    }

    @Override
    public void run() {
        super.run();
        myObject.methodB();
    }
}
