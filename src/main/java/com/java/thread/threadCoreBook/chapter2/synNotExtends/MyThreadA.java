package com.java.thread.threadCoreBook.chapter2.synNotExtends;

/**
 * Created by duanxiangchao on 2018/8/20
 */
public class MyThreadA extends Thread {

    private Sub sub;

    public MyThreadA(Sub sub){
        this.sub = sub;
    }

    @Override
    public void run() {
        sub.serviceMethod();
    }
}
