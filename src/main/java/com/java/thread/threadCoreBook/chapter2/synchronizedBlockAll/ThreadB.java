package com.java.thread.threadCoreBook.chapter2.synchronizedBlockAll;

/**
 * Created by duanxiangchao on 2018/9/14
 */
public class ThreadB extends Thread {


    private Service service;

    private MyObject myObject;

    public ThreadB(Service service, MyObject myObject){
        this.service = service;
        this.myObject = myObject;
    }

    @Override
    public void run() {
        super.run();
        service.testMethod1(myObject);
    }
}
