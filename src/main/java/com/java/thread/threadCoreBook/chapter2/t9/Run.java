package com.java.thread.threadCoreBook.chapter2.t9;

/**
 * Created by duanxiangchao on 2018/8/30
 */
public class Run {

    public static void main(String[] args) {
        MyOneList list = new MyOneList();
        MyThread1 thread1 = new MyThread1(list);
        thread1.setName("A");
        thread1.start();
        MyThread2 thread2 = new MyThread2(list);
        thread1.setName("A");
        thread2.start();
        try {
            Thread.sleep(6000);
            System.out.println("listSize=" + list.getSize());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
