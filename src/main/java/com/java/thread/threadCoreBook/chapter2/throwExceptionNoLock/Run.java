package com.java.thread.threadCoreBook.chapter2.throwExceptionNoLock;

/**
 * Created by duanxiangchao on 2018/8/20
 */
public class Run {

    public static void main(String[] args) {
        try {
            Service service = new Service();
            ThreadA a = new ThreadA(service);
            a.setName("a");
            a.start();
            Thread.sleep(5000);
            ThreadB b = new ThreadB(service);
            b.setName("b");
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
