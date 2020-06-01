package com.java.thread.threadCoreBook.chapter2.sychronizedOneThreadIn;

/**
 * Created by duanxiangchao on 2018/8/22
 */
public class Run {

    public static void main(String[] args) {
        ObjectService objectService = new ObjectService();
        System.out.println();
        ThreadA threadA = new ThreadA(objectService);
        threadA.start();
        ThreadB threadB = new ThreadB(objectService);
        threadB.start();
    }

}
