package com.java.threads;

/**
 * Created by duanxiangchao on 2015/8/11.
 */
public class JoinTest {

    public static void main(String [] str){

        Thread1 thread1 = new Thread1("thread1");
        Thread2 thread2 = new Thread2("thread2", thread1);
        thread2.start();

    }

}
