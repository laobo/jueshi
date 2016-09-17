package com.java.threads;

/**
 * Created by duanxiangchao on 2015/8/11.
 */
public class MyThread extends Thread{

    public static int n = 0;

    @Override
    public void run() {
        int m = n;
        yield();
        m++;
        n = m;
    }

    public static void main(String [] str) throws InterruptedException {
        MyThread myThread = new MyThread();
        Thread[] thread = new Thread[100];
        for(int i = 0; i < 100; i++){
            thread[i] = new Thread(myThread);
        }
        for(int i = 0; i < 100; i++){
            thread[i].start();
        }
        for(int i = 0; i < 100; i++){
            thread[i].join();
        }
        System.out.println("n = "+ myThread.n);
    }

}
