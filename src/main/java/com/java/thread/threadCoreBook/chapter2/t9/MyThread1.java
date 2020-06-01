package com.java.thread.threadCoreBook.chapter2.t9;

/**
 * Created by duanxiangchao on 2018/8/30
 */
public class MyThread1 extends Thread {

    private MyOneList list;

    public MyThread1(MyOneList list){
        super();
        this.list = list;
    }

    @Override
    public void run() {
        MyService msRef = new MyService();
        msRef.addServiceMethod(list, "A");
    }
}
