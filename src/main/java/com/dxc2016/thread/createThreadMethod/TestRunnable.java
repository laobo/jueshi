package com.dxc2016.thread.createThreadMethod;

/**
 * Created by duanxiangchao on 2016/6/17.
 */
public class TestRunnable {

    public static void main(String[] str){

        DoSomeThing ds1 = new DoSomeThing("张三");
        DoSomeThing ds2 = new DoSomeThing("李四");

        Thread thread1 = new Thread(ds1);
        Thread thread2 = new Thread(ds1);

        thread1.start();
        thread2.start();

    }

}
