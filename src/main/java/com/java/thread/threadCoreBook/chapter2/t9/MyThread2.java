package com.java.thread.threadCoreBook.chapter2.t9;

/**
 * Created by duanxiangchao on 2018/8/30
 */
public class MyThread2 extends Thread {

    private MyOneList list;

    public MyThread2(MyOneList list){
        this.list = list;
    }

    @Override
    public void run() {
        MyService myRef = new MyService();
        myRef.addServiceMethod(list, "B");
    }
}
