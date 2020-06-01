package com.java.thread.threadCoreBook.chapter2.synNotExtends;

/**
 * Created by duanxiangchao on 2018/8/20
 */
public class MyThreadB extends Thread {

    private Sub sub;

    public MyThreadB(Sub sub){
        this.sub = sub;
    }

    @Override
    public void run() {
        sub.serviceMethod();
    }

}
