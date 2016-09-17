package com._2016_7.thread_boke;

/**
 * Created by duanxiangchao on 2016/7/11.
 * 实现了Runnable接口的线程
 */
public class Thread1 implements Runnable {

    private String name;

    public Thread1(String name){
        this.name = name;
    }

    public void run() {
        System.out.println("启动实现了Runnable的线程！");
    }
}
