package com.java.thread.basic;

/**
 * Created by duanxiangchao on 2015/8/11.
 */
public class MyRunnable implements Runnable {

    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String [] str){
        MyRunnable t1 = new MyRunnable();
        MyRunnable t2 = new MyRunnable();
        Thread th1 = new Thread(t1, "MyThread1");
        Thread th2 = new Thread(t2);
        th2.setName("MyThread2");

        th1.start();
        th2.start();

    }

}
