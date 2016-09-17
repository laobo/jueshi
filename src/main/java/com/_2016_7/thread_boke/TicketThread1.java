package com._2016_7.thread_boke;

/**
 * Created by duanxiangchao on 2016/7/12.
 */
public class TicketThread1 extends Thread {

    private int ticket = 5;

    @Override
    public void run() {
        super.run();
        for(int i = 1; ticket > 0; i++){
            System.out.println(Thread.currentThread().getName() + "卖出第" + i + "张票");
            ticket--;
        }
    }

}
