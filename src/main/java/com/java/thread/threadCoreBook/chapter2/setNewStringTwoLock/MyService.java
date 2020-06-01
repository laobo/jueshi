package com.java.thread.threadCoreBook.chapter2.setNewStringTwoLock;

/**
 * Created by duanxiangchao on 2018/9/14
 */
public class MyService {

    private String lock = "123";

    public void testMethod(){
        synchronized (lock){
            System.out.println(Thread.currentThread().getName() + "begin " + System.currentTimeMillis());
            lock = "456";
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "end " + System.currentTimeMillis());
        }
    }

}
