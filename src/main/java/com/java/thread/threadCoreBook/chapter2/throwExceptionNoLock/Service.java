package com.java.thread.threadCoreBook.chapter2.throwExceptionNoLock;

/**
 * Created by duanxiangchao on 2018/8/20
 */
public class Service {

    synchronized public void testMethod(){
        if(Thread.currentThread().getName().equals("a")){
            System.out.println("ThreadName=" + Thread.currentThread().getName() + " run beginTime=" + System.currentTimeMillis());
            int i = 1;
            while (i == 1){
                if(("" + Math.random()).substring(0, 8).equals("0.123456")){
                    System.out.println("ThreadName=" + Thread.currentThread().getName()
                    + " run exceptionTime="
                    + System.currentTimeMillis());
                    Integer.parseInt("a");
                }
            }
        } else {
            System.out.println("Thread B run Time=" + System.currentTimeMillis());
        }
    }

}
