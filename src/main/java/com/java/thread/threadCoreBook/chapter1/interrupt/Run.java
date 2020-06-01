package com.java.thread.threadCoreBook.chapter1.interrupt;

/**
 * Created by duanxiangchao on 2018/8/13
 */
public class Run {

    public static void main(String[] args) {
//        test1();
        test2();
    }

    public static void test2(){
        Thread.currentThread().interrupt();
        System.out.println("是否停止1？=" + Thread.interrupted());
        System.out.println("是否停止2？=" + Thread.interrupted());
    }

    public static void test1(){
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.interrupt();
            //测试当前执行该方法的线程是否中断    main线程是否中断
            System.out.println("是否停止1？=" + Thread.interrupted());
            System.out.println("是否停止2？=" + Thread.interrupted());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
