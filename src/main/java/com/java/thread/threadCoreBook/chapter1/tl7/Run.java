package com.java.thread.threadCoreBook.chapter1.tl7;

/**
 * Created by duanxiangchao on 2018/8/14
 */
public class Run {

    public static void main(String[] args) {
        try {
            SychronizedObject object = new SychronizedObject();
            MyThread thread = new MyThread(object);
            thread.start();
            Thread.sleep(500);
            thread.stop();
            System.out.println(object.getUsername() + " " + object.getPassword());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
