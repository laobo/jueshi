package com.java.thread.threadCoreBook.chapter1.tl6;

/**
 * Created by duanxiangchao on 2018/8/14
 */
public class StopThread extends Thread {

    @Override
    public void run() {
        super.run();
        try {
            this.stop();
        } catch (ThreadDeath e){
            System.out.println("进入catch（）方法！");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        StopThread stopThread = new StopThread();
        stopThread.start();
    }

}
