package com.java.thread.basic;

/**
 * Created by duanxiangchao on 2015/8/11.
 */
public class ThreadFlag extends Thread {

    public volatile boolean exit = false;

    @Override
    public void run() {
        while (! exit) ;
    }

    public static void main(String[] str) throws InterruptedException {
        ThreadFlag thread = new ThreadFlag();
        thread.start();
        sleep(5000);          //主线程延迟5秒
        thread.exit = true;   //终止线程
        thread.join();
        System.out.println("线程退出！");
    }

}
