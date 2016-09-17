package com._2016_7.thread_lock;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by duanxiangchao on 2016/7/13.
 */
public class TestLock {

    private ArrayList<Integer> arrayList = new ArrayList<Integer>();

    Lock lock = new ReentrantLock();

    public static void main(String[] str){
        final  TestLock testLock = new TestLock();

        new Thread(){
            @Override
            public void run() {
                testLock.insert(Thread.currentThread());
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                testLock.insert(Thread.currentThread());
            }
        }.start();

    }

    public void insert(Thread thread){

        lock.lock();
        try{
            System.out.println(thread.getName() + "得到了锁！");
            for(int i = 0; i < 10; i++){
                arrayList.add(i);
//                System.out.println(Thread.currentThread().getName());
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println(thread.getName() + "释放了锁！");
            lock.unlock();
        }
    }

}
