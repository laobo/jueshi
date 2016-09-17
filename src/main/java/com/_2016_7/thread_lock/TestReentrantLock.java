package com._2016_7.thread_lock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by duanxiangchao on 2016/7/13.
 */
public class TestReentrantLock {

    private ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();


    public static void main(String[] str){
        final TestReentrantLock testReentrantLock = new TestReentrantLock();

        new Thread(){
            @Override
            public void run() {
                testReentrantLock.get(Thread.currentThread());
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                testReentrantLock.get(Thread.currentThread());
            }
        }.start();
    }

    public void get(Thread thread){
        rwl.readLock().lock();
        try{
            long startTime = System.currentTimeMillis();
            while (System.currentTimeMillis() - startTime < 1){
                System.out.println(thread.getName() + "正在进行读操作！");
            }
        }finally {
            System.out.println(thread.getName() + "读操作完毕！");
        }

    }

}
