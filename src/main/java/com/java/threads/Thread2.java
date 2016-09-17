package com.java.threads;

/**
 * Created by duanxiangchao on 2015/8/11.
 */
public class Thread2 extends Thread {

    private Thread1 thread1;

    public Thread2(String threadName, Thread1 thread1){
        super(threadName);
        this.thread1 = thread1;
    }

    @Override
    public void run() {
        System.out.println(getName() + " is running!");
        try {
            thread1.start();
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName() + " is over！");
    }
}
