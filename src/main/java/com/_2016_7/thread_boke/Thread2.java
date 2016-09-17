package com._2016_7.thread_boke;

/**
 * Created by duanxiangchao on 2016/7/12.
 */
public class Thread2 extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("启动继承了Thread的线程！");
    }
}
