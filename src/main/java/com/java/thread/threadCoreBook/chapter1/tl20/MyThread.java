package com.java.thread.threadCoreBook.chapter1.tl20;

/**
 * Created by duanxiangchao on 2018/8/17
 */
public class MyThread extends Thread {

    private int i = 0;

    @Override
    public void run() {
        try {
            while (true){
                i++;
                System.out.println("i=" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e){

        }
    }
}
