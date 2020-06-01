package com.java.thread.threadCoreBook.chapter2.throwExceptionNoLock;

/**
 * Created by duanxiangchao on 2018/8/20
 */
public class ThreadB extends Thread {

    private Service service;

    public ThreadB(Service service){
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.testMethod();
    }
}
