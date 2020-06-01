package com.java.thread.threadCoreBook.chapter1.tl7;

/**
 * Created by duanxiangchao on 2018/8/14
 */
public class MyThread extends Thread {

    private SychronizedObject object;

    public MyThread(SychronizedObject object){
        super();
        this.object = object;
    }

    @Override
    public void run() {
        object.printString("b", "bb");
    }
}
