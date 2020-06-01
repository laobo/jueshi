package com.java.thread.threadCoreBook.chapter2.t7;

/**
 * Created by duanxiangchao on 2018/8/22
 */
public class MyThread2 extends Thread {

    private Task task;

    public MyThread2(Task task){
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.doLongTask();
    }

}
