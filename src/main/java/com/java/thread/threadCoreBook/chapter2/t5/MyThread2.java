package com.java.thread.threadCoreBook.chapter2.t5;

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
        CommonUtils.beginTime2 = System.currentTimeMillis();
        task.doLongTimeTask();
        CommonUtils.endTime2  = System.currentTimeMillis();
    }

}
