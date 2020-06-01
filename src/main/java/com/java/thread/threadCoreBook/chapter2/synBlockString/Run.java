package com.java.thread.threadCoreBook.chapter2.synBlockString;

/**
 * Created by duanxiangchao on 2018/8/22
 */
public class Run {

    public static void main(String[] args) {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        threadA.start();

        ThreadB threadB = new ThreadB(service);
        threadB.start();
    }

}
