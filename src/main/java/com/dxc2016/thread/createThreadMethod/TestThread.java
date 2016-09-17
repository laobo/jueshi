package com.dxc2016.thread.createThreadMethod;

/**
 * Created by duanxiangchao on 2016/6/17.
 */
public class TestThread extends Thread {

    public TestThread(String name){
        super(name);
    }

    @Override
    public void run() {
        for(int i = 0;i < 5; i++){
            System.out.println(this.getName() + ":" + i);
        }
    }

    public static void main(String [] str){
        TestThread thread1 = new TestThread("张三");
        TestThread thread2 = new TestThread("李四");
        thread1.start();
        thread2.start();
        System.out.println(Thread.currentThread().getName());
    }

}
