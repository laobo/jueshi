package com.java.thread.threadCoreBook.chapter2.tl4_1;

/**
 * Created by duanxiangchao on 2018/8/20
 */
public class ThreadA extends Thread {

    private MyObject myObject;

    public ThreadA(MyObject myObject){
        this.myObject = myObject;
    }

    @Override
    public void run() {
        super.run();
        myObject.methodA();
    }
}
