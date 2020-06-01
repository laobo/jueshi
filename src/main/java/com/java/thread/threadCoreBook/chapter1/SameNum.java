package com.java.thread.threadCoreBook.chapter1;

/**
 * Created by duanxiangchao on 2018/8/13
 */
public class SameNum {

    public static void main(String[] args) {
        NumThread numThread = new NumThread();
        Thread thread1 = new Thread(numThread);
        Thread thread2 = new Thread(numThread);
        Thread thread3 = new Thread(numThread);
        Thread thread4 = new Thread(numThread);
        Thread thread5 = new Thread(numThread);
        Thread thread6 = new Thread(numThread);
        Thread thread7 = new Thread(numThread);
        Thread thread8 = new Thread(numThread);
        Thread thread9 = new Thread(numThread);
        Thread thread10 = new Thread(numThread);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
        thread10.start();

    }

}

class NumThread extends Thread {

    private int i = 5;
    @Override
    public void run(){
        System.out.println("i="+(i--)+"    threadName="+Thread.currentThread().getName());
    }

}

