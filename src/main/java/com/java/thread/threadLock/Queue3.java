package com.java.thread.threadLock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by duanxiangchao on 2015/8/13.
 */
public class Queue3 {

    //共享数据，只能一个写，可以多个读
    private Object data = null;

    ReadWriteLock rwl = new ReentrantReadWriteLock();

    //读操作
    public void get(){
        rwl.readLock().lock();
        try {
            System.out.println(Thread.currentThread().getName() + "be read to read data!");
            Thread.sleep((long) (Math.random() * 1000));
            System.out.println(Thread.currentThread().getName() + "have read data:" + data);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            rwl.readLock().unlock();
        }
    }

    //写操作
    public void put(){
        rwl.writeLock().lock();
        try {
            System.out.println(Thread.currentThread().getName() + "be read to write data!");
            Thread.sleep((long) (Math.random() * 1000));
            System.out.println(Thread.currentThread().getName() + "have write data:" + data);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            rwl.writeLock().unlock();
        }
    }

}
