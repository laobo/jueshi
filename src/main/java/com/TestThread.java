package com;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by duanxiangchao on 2019/7/24
 */
public class TestThread extends Thread {

    private static final AtomicInteger count = new AtomicInteger();
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().maxMemory());

        while (true)
            (new TestThread()).start();
    }
    @Override
    public void run() {
        System.out.println(count.incrementAndGet());
        while (true)
            try {
                Thread.sleep(Integer.MAX_VALUE);
            } catch (InterruptedException e) {
                break;
            }
    }

}
