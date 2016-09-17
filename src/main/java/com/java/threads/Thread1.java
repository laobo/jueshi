package com.java.threads;

/**
 * Created by duanxiangchao on 2015/8/11.
 */
public class Thread1 extends Thread {

    public Thread1(String threadName){
        super(threadName);
    }

    @Override
    public void run() {
        System.out.println(getName() + " is running!");
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName() + " is over!");
    }
}
