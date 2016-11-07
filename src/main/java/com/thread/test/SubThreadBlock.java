package com.thread.test;

import java.util.concurrent.BlockingQueue;

/**
 * Created by duanxiangchao on 2016/7/30.
 */
public class SubThreadBlock extends Thread {

    private BlockingQueue<Integer> queue;

    public SubThreadBlock(BlockingQueue<Integer> queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            System.out.println("sub thread start working.");
            sleep(5000);
            System.out.println("sub thread end working.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            try {
                queue.put(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
