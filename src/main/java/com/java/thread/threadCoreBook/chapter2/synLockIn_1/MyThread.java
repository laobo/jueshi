package com.java.thread.threadCoreBook.chapter2.synLockIn_1;

/**
 * Created by duanxiangchao on 2018/8/20
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        Service service = new Service();
        service.service1();
    }
}
