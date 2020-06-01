package com.java.thread.threadCoreBook.chapter2.t7;

/**
 * Created by duanxiangchao on 2018/8/22
 */
public class MyThread1 extends Thread {

    private Task task;

    public MyThread1(Task task){
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.doLongTask();
    }
}
