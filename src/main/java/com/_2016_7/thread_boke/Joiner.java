package com._2016_7.thread_boke;

/**
 * Created by duanxiangchao on 2016/7/13.
 */
public class Joiner extends Thread {

    private Thread thread;

    public Joiner(Thread thread, String name){
        super(name);
        this.thread = thread;
    }

    @Override
    public void run() {
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName() + "is completed!");
    }
}
