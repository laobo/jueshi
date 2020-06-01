package com.java.thread.threadCoreBook.chapter2.innerTest2;

/**
 * Created by duanxiangchao on 2018/9/14
 */
public class Run {

    public static void main(String[] args) {

        final OutClass.InnerClass1 innerClass1 = new OutClass.InnerClass1();
        final OutClass.InnerClass2 innerClass2 = new OutClass.InnerClass2();

        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                innerClass1.method1(innerClass2);
            }
        }, "A");

        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                innerClass1.method2();
            }
        }, "B");

        Thread threadC = new Thread(new Runnable() {
            @Override
            public void run() {
                innerClass2.method1();
            }
        }, "C");

        threadA.start();
        threadB.start();
        threadC.start();

    }

}
