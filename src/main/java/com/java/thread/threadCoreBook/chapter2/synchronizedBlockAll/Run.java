package com.java.thread.threadCoreBook.chapter2.synchronizedBlockAll;

/**
 * Created by duanxiangchao on 2018/8/30
 */
public class Run {

    public static void main(String[] args) {
        Service service = new Service();
        MyObject myObject = new MyObject();
        ThreadA threadA = new ThreadA(service, myObject);
        threadA.setName("A");
        threadA.start();
        ThreadB threadB = new ThreadB(service, myObject);
        threadB.setName("B");
        threadB.start();
    }

}
