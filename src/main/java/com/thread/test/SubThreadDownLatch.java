package com.thread.test;

import java.util.concurrent.CountDownLatch;

/**
 * Created by duanxiangchao on 2016/7/30.
 */
public class SubThreadDownLatch extends Thread {

    private CountDownLatch countDownLatch;

    public SubThreadDownLatch(CountDownLatch countDownLatch){
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {

        try {
            System.out.println(Thread.currentThread().getName() + " start working......");
                    sleep(5000);
//            System.out.println("sub thread end working.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            System.out.println(Thread.currentThread().getName() + " has done1");
            countDownLatch.countDown();
        }

    }
}
