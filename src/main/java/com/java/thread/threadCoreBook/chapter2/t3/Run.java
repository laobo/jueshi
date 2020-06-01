package com.java.thread.threadCoreBook.chapter2.t3;

/**
 * Created by duanxiangchao on 2018/8/20
 */
public class Run {

    public static void main(String[] args) {
        try {
            PublicCar publicCar = new PublicCar();
            ThreadA threadA = new ThreadA(publicCar);
            threadA.start();
            Thread.sleep(200);
            publicCar.getValue();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
