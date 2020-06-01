package com.java.thread.threadCoreBook.chapter2.synchronizedBlockAll;

/**
 * Created by duanxiangchao on 2018/8/30
 */
public class Service {

    public void testMethod1(MyObject myObject){

        synchronized (myObject){
            try {
                System.out.println("testMethod1 getLock time="
                        + System.currentTimeMillis() + " run ThreadName="
                        + Thread.currentThread().getName());
                Thread.sleep(2000);
                System.out.println("testMethod1 releaseLock time="
                        + System.currentTimeMillis() + " run ThreadName="
                        + Thread.currentThread().getName());
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }

}
