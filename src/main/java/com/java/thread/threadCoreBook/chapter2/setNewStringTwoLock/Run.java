package com.java.thread.threadCoreBook.chapter2.setNewStringTwoLock;

/**
 * Created by duanxiangchao on 2018/9/14
 */
public class Run {

    public static void main(String[] args) {

        MyService myService = new MyService();
        ThreadA threadA = new ThreadA(myService);
        threadA.setName("A");
        ThreadB threadB = new ThreadB(myService);
        threadB.setName("B");
        threadA.start();
//        try {
//            Thread.sleep(50);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        threadB.start();


    }

}
