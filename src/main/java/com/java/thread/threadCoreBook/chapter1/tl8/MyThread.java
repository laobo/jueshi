package com.java.thread.threadCoreBook.chapter1.tl8;

/**
 * Created by duanxiangchao on 2018/8/14
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        while (true){
            if(this.isInterrupted()){
                System.out.println("停止了");
                return;
            }
            System.out.println("timer=" + System.currentTimeMillis());
        }
    }
}
