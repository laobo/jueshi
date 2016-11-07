package com.java.thread.basic;

/**
 * Created by duanxiangchao on 2015/8/11.
 */
public class MyThread1 extends Thread {

    private String name;

    public MyThread1(String name){
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("hello " + name);
    }

    public static void main(String [] str){
        Thread thread = new MyThread1("world");
        thread.start();
    }

}
