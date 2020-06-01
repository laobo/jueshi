package com.java.thread.threadCoreBook.chapter2.tl4_1;

/**
 * Created by duanxiangchao on 2018/8/20
 */
public class Run {

    public static void main(String[] args) {
        MyObject myObject = new MyObject();
        ThreadA threadA = new ThreadA(myObject);
        threadA.setName("ThreadA");
        threadA.start();
        ThreadB threadB = new ThreadB(myObject);
        threadB.setName("ThreadB");
        threadB.start();
    }

}
