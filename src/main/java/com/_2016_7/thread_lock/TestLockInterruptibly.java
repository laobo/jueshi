package com._2016_7.thread_lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by duanxiangchao on 2016/7/13.
 */
public class TestLockInterruptibly {

    private Lock lock = new ReentrantLock();

    public static void main(String[] str){

        TestLockInterruptibly test = new TestLockInterruptibly();

        MyThread myThread1 = new MyThread(test);
        MyThread myThread2 = new MyThread(test);

        myThread1.start();
        myThread2.start();

//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        myThread2.interrupt();

    }

    public void insert(Thread thread) throws InterruptedException {
        lock.lockInterruptibly();
        try {
            System.out.println(thread.getName() + "得到了锁！");
            long startTime = System.currentTimeMillis();
            for( ; ; ){
                if(System.currentTimeMillis() -  startTime > 5000)
                    break;
            }
        }finally {
            System.out.println(thread.getName() + "执行finally方法");
            lock.unlock();
            System.out.println(thread.getName() + "释放了所！");
        }
    }

}

class MyThread extends Thread{
    private TestLockInterruptibly testLockInterruptibly = null;
    public MyThread(TestLockInterruptibly testLockInterruptibly){
        this.testLockInterruptibly = testLockInterruptibly;
    }

    @Override
    public void run() {
        try {
            testLockInterruptibly.insert(Thread.currentThread());
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + "被中断！");
        }
    }
}
