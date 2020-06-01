package com.java.thread.threadCoreBook.chapter2.t10;

/**
 * Created by duanxiangchao on 2018/9/14
 */
public class Run {

    public static void main(String[] args) {
        PrintString printString = new PrintString();
        new Thread(printString).start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("我要停止它！stopThread=" + Thread.currentThread().getName());
        printString.setContinuePrint(false);
    }

}
