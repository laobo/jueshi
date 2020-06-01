package com.java.thread.threadCoreBook.chapter1;

/**
 * Created by duanxiangchao on 2018/8/13
 */
public class Run {

    public static void main(String[] args) {

//        test1();
        test2();

    }

    public static void test1(){
        MyThread myThread1 = new MyThread("A");
        MyThread myThread2 = new MyThread("B");
        MyThread myThread3 = new MyThread("C");
        myThread1.start();
        myThread2.start();
        myThread3.start();
        System.out.println("运行结束！");
    }

    public static void test2(){
        MyThread myThread = new MyThread();
        Thread thread1 = new Thread(myThread, "A");
        Thread thread2 = new Thread(myThread, "B");
        Thread thread3 = new Thread(myThread, "C");
        Thread thread4 = new Thread(myThread, "D");
        Thread thread5 = new Thread(myThread, "E");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        System.out.println("运行结束！");
    }

}
