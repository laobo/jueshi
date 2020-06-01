package com.java.thread.threadCoreBook.chapter2.tl4_2;

/**
 * Created by duanxiangchao on 2018/8/20
 */
public class Run {

    public static void main(String[] args) {
        MyObject myObject = new MyObject();
        ThreadA threadA = new ThreadA(myObject);
        ThreadB threadB = new ThreadB(myObject);
        threadA.start();
        threadB.start();
    }

}
