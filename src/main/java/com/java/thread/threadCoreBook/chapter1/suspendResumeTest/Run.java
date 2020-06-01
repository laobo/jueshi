package com.java.thread.threadCoreBook.chapter1.suspendResumeTest;

/**
 * Created by duanxiangchao on 2018/8/14
 */
public class Run {

    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(5000);

            //A段
            thread.suspend();
            System.out.println("A=" + System.currentTimeMillis() + " i=" + thread.getI());
            Thread.sleep(5000);
            System.out.println("A=" + System.currentTimeMillis() + " i=" + thread.getI());

            //B段
            thread.resume();
            Thread.sleep(5000);

            //C段
            thread.suspend();
            System.out.println("B=" + System.currentTimeMillis() + " i=" + thread.getI());
            Thread.sleep(5000);
            System.out.println("B=" + System.currentTimeMillis() + " i=" + thread.getI());

        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
