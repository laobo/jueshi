package com.thread.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;

/**
 * Created by duanxiangchao on 2016/7/30.
 */
public class CountDownLatchTest {

    static final BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(1);

    public static void main(String[] art){
        int threads = 5;
        CountDownLatch countDownLatch = new CountDownLatch(threads);
        for(int i = 0; i < threads; i++){
            SubThreadDownLatch subThreadDownLatch = new SubThreadDownLatch(countDownLatch);
            subThreadDownLatch.start();
        }
        mainWork();
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("now all done!");

    }

    private static void mainWork(){
        try {
            System.out.println("main thread start work!");
            Thread.sleep(3000);
            System.out.println("main thread end work!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
