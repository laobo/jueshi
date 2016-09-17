package com.dxc.threadPool;

/**
 * Created by bf on 2015/10/8.
 */
public class MyThread implements Runnable {

    public void run() {
        System.out.println(Thread.currentThread().getName() + " 正在执行！");
    }

}
