package com.java.thread.threadCoreBook.chapter2.tl1;

/**
 * Created by duanxiangchao on 2018/8/20
 */
public class ThreadA extends Thread {

    private HasSelfPrivateNum num;

    public ThreadA(HasSelfPrivateNum num){
        this.num = num;
    }

    @Override
    public void run() {
        super.run();
        num.addI("a");
    }
}
