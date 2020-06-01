package com.java.thread.threadCoreBook.chapter2.t3;

/**
 * Created by duanxiangchao on 2018/8/20
 */
public class ThreadA extends Thread {

    private PublicCar publicCar;

    public ThreadA(PublicCar publicCar){
        this.publicCar = publicCar;
    }

    @Override
    public void run() {
        super.run();
        publicCar.setValue("B", "BB");
    }
}
