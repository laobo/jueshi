package com.java.thread.threadCoreBook.chapter2.t5;

/**
 * Created by duanxiangchao on 2018/8/22
 */
public class Run {

    public static void main(String[] args) {
        Task task = new Task();

        MyThread1 thread1 = new MyThread1(task);
        thread1.start();
        MyThread2 thread2 = new MyThread2(task);
        thread2.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long beginTime = CommonUtils.beginTime1;
        if(CommonUtils.beginTime2 < beginTime){
            beginTime = CommonUtils.beginTime2;
        }
        long endTime = CommonUtils.endTime1;
        if(CommonUtils.endTime2 > endTime){
            endTime = CommonUtils.endTime2;
        }
        System.out.println("耗时：" + (endTime - beginTime));
    }

}
