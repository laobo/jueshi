package com.java.thread.threadCoreBook.chapter2.t7;

/**
 * Created by duanxiangchao on 2018/8/22
 */
public class Task {

    public void doLongTask(){
        for(int i = 0; i < 100; i++){
            System.out.println("nosynchronized threadName="
            + Thread.currentThread().getName() + " i=" + (i + 1));
        }
        System.out.println("");
        synchronized (this){
            for(int i = 0; i < 100; i++){
                System.out.println("synchronized threadName="
                        + Thread.currentThread().getName() + " i=" + (i + 1));
            }
        }
    }

}
