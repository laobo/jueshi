package com.java.thread.threadCoreBook.chapter2.tl1;

/**
 * Created by duanxiangchao on 2018/8/20
 */
public class Run {

    public static void main(String[] args) {
        HasSelfPrivateNum num = new HasSelfPrivateNum();
        ThreadA threadA = new ThreadA(num);
        threadA.start();
        ThreadB threadB = new ThreadB(num);
        threadB.start();
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }

}
