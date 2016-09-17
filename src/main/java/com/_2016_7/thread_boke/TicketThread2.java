package com._2016_7.thread_boke;

/**
 * Created by duanxiangchao on 2016/7/12.
 */
public class TicketThread2 implements Runnable {

    private int ticket = 5;

    public void run() {
        while (ticket > 0){
            System.out.println(Thread.currentThread().getName() + "卖出第" + (ticket--) + "张票！");
        }
    }
}
