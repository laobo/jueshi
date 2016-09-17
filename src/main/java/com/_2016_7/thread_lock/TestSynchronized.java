package com._2016_7.thread_lock;

/**
 * Created by duanxiangchao on 2016/7/13.
 */
public class TestSynchronized {


    public static void main(String[] str){
        final TestSynchronized testSynchronized = new TestSynchronized();

        new Thread(){
            @Override
            public void run() {
                testSynchronized.get(Thread.currentThread());
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                testSynchronized.get(Thread.currentThread());
            }
        }.start();
    }

    public synchronized void get(Thread thread){
        long startTime = System.currentTimeMillis();
        while (System.currentTimeMillis() - startTime < 1){
            System.out.println(thread.getName() + "正在就进行读操作！");
        }
        System.out.println(thread.getName() + "读操作完毕！");
    }
}
