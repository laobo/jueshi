package com.java.thread.threadCoreBook.chapter1;

/**
 * Created by duanxiangchao on 2018/8/13
 */
public class CountOperate extends Thread {

    public CountOperate(){
        System.out.println("CountOperate---begin");
        System.out.println("Thread.currentThread().getName()=" + Thread.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive()=" + Thread.currentThread().isAlive());
        System.out.println("this.getName()=" + this.getName());
        System.out.println("this.isAlive()=" + this.isAlive());
        System.out.println("CountOperate---end");
    }

    @Override
    public void run() {
        System.out.println("run---begin");
        System.out.println("Thread.currentThread().getName()=" + Thread.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive()=" + Thread.currentThread().isAlive());
        System.out.println("this.getName()=" + this.getName());
        System.out.println("this.isAlive()=" + this.isAlive());
        System.out.println(Thread.currentThread().getId());
        System.out.println("run---end");
    }

    public static void main(String[] args) {
        CountOperate countOperate = new CountOperate();
        Thread thread1 = new Thread(countOperate);
        System.out.println("main begin thread1 isAlive=" + thread1.isAlive());
        System.out.println(Thread.currentThread().getId());
        thread1.setName("A");
        thread1.start();
        System.out.println("main end thread1 isAlive=" + thread1.isAlive());
    }

}
