package com.java.thread.threadCoreBook.chapter1.tl20;

/**
 * Created by duanxiangchao on 2018/8/17
 */
public class ThreadDemo extends Thread {

    public ThreadDemo(){
        super("laobo");
    }

    @Override
    public void run() {
        try {
            for(int i = 0; i <=40; i++){
                Thread.sleep(100);
                System.out.println("TestThread:" + Thread.currentThread().getName() + i);
            }

        } catch (InterruptedException e){

        }
    }
}
