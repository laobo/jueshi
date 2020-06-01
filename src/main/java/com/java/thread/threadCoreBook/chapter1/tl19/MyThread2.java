package com.java.thread.threadCoreBook.chapter1.tl19;

import java.util.Random;

/**
 * Created by duanxiangchao on 2018/8/15
 */
public class MyThread2 extends Thread {

    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        long addResult = 0;
        for(int j = 0; j < 100; j++){
            for(int i = 0; i < 50000; i++){
                Random random = new Random();
                random.nextInt();
                addResult = addResult + i;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("☆ ☆ ☆ ☆ ☆ thread1 user time=" + (endTime - beginTime));
    }

}
