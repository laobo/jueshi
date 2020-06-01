package com.java.thread.threadCoreBook.chapter2.setNewStringTwoLock;

/**
 * Created by duanxiangchao on 2018/9/14
 */
public class ThreadB extends Thread {

    private MyService myService;

    public ThreadB(MyService myService){
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.testMethod();
    }

}
