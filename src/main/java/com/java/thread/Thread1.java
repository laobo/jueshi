package com.java.thread;

/**
 * Created by duanxiangchao on 2015/8/11.
 */
public class Thread1 extends Thread{

    @Override
    public void run() {
        System.out.println(this.getName());
    }

    public static void main(String[]str){
        System.out.println(Thread.currentThread().getName());
        Thread1 th1 = new Thread1();
        Thread1 th2 = new Thread1();
        th1.start();
        th2.start();
    }

}
