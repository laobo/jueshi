package com.java.thread.threadCoreBook.chapter2.synchronizedBlockAll;

/**
 * Created by duanxiangchao on 2018/8/30
 */
public class ThreadA extends Thread {

    private Service service;
    private MyObject myObject;

    public ThreadA(Service service, MyObject myObject){
        this.service = service;
        this.myObject = myObject;
    }

    @Override
    public void run() {
        service.testMethod1(myObject);
    }
}
