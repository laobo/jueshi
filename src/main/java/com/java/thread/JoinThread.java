package com.java.thread;

/**
 * Created by duanxiangchao on 2015/8/11.
 */
public class JoinThread extends Thread {

    private static volatile int n = 0;

    static synchronized void inc(){
        n++;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            try {
                inc();
                sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String [] str) throws InterruptedException {
        Thread [] threads = new Thread[100];
        for(int i = 0; i < 100; i++){
            threads[i] = new JoinThread();
        }
        for(int i = 0; i < 100; i++){
            threads[i].start();
            threads[i].join();
        }
        System.out.println("n=" + JoinThread.n);
    }

}
