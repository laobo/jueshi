package com.java.thread;

import java.io.IOException;

/**
 * Created by duanxiangchao on 2015/8/11.
 */
public class ThreadInterrupt extends Thread {

    @Override
    public void run() {
        try {
            sleep(50000);
        } catch (InterruptedException e) {
            e.getMessage();
        }
    }

    public static void main(String [] str) throws IOException, InterruptedException {
        Thread thread = new ThreadInterrupt();
        thread.start();
        System.out.println("在50秒内按任意键中断线程！");
        System.in.read();
        thread.interrupt();
        thread.join();
        System.out.println("线程已经退出！");
    }



}
