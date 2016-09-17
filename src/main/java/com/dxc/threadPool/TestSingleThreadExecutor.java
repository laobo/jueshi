package com.dxc.threadPool;

import com.java.thread.Thread1;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by bf on 2015/10/8.
 */
public class TestSingleThreadExecutor {

    public static void main(String [] str){

        //单线程线程池
        //testSingleThreadExecutor();
        //固定大小的线程池
        testFixedThreadPool();
        //可重用固定线程数的线程池
//        testCachedThreadPool();

    }

    //单线程线程池
    static void testSingleThreadExecutor(){

        ExecutorService pool = Executors.newSingleThreadExecutor();
        Thread thread1 = new Thread(new MyThread());
        Thread thread2 = new Thread(new MyThread());
        Thread thread3 = new Thread(new MyThread());
        pool.execute(thread1);
        pool.execute(thread2);
        pool.execute(thread3);
        pool.shutdown();

    }

    //固定大小的线程池
    static void testFixedThreadPool(){

        ExecutorService pool = Executors.newFixedThreadPool(2);
        Thread thread1 = new Thread(new MyThread());
        Thread thread2 = new Thread(new MyThread());
        Thread thread3 = new Thread(new MyThread());
        pool.execute(thread1);
        pool.execute(thread2);
        pool.execute(thread3);
        pool.shutdown();

    }

    //可重用固定线程数的线程池
    static void testCachedThreadPool(){
        ExecutorService pool = Executors.newCachedThreadPool();
        Thread thread1 = new Thread(new MyThread());
        Thread thread2 = new Thread(new MyThread());
        Thread thread3 = new Thread(new MyThread());
        pool.execute(thread1);
        pool.execute(thread2);
        pool.execute(thread3);
        pool.shutdown();
    }

}
