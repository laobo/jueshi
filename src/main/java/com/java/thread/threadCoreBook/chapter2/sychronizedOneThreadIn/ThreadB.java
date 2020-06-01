package com.java.thread.threadCoreBook.chapter2.sychronizedOneThreadIn;

/**
 * Created by duanxiangchao on 2018/8/22
 */
public class ThreadB extends Thread {

    private ObjectService objectService;

    public ThreadB(ObjectService objectService){
        this.objectService = objectService;
    }

    @Override
    public void run() {
        super.run();
        objectService.serviceMethod();
    }

}
