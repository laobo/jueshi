package com.java.thread.threadCoreBook.chapter2.t16;

/**
 * Created by duanxiangchao on 2018/9/14
 */
public class RunThread extends Thread {

    private volatile boolean isRunning = true;

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    @Override
    public void run() {
        System.out.println("进入run了");
        while (isRunning){

        }
        System.out.println("线程被停止了！");
    }
}
