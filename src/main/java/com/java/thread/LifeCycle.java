package com.java.thread;

/**
 * Created by duanxiangchao on 2015/8/11.
 */
public class LifeCycle extends Thread {

    @Override
    public void run() {
        int n = 0;
        while((++n) < 1000) ;
    }

    public static void main(String [] str) throws InterruptedException {
        LifeCycle thread1 = new LifeCycle();
        System.out.println("isAlive:"+ thread1.isAlive());
        thread1.start();
        System.out.println("isAlive:" + thread1.isAlive());
        //保证线程run方法完成后，线程才继续运行
        thread1.join();
        System.out.println("thread1已经结束！");
        System.out.println("isAlive:" + thread1.isAlive());
    }

}
