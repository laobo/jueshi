package com.java.thread.threadCoreBook.chapter2.innerTest1;

/**
 * Created by duanxiangchao on 2018/9/14
 */
public class OutClass {

    static class Inner{

        public void method1(){
            synchronized ("其他的锁") {
                for (int i = 0; i <= 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " i=" + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        public synchronized void method2() {
            for (int i = 0; i <= 20; i++) {
                System.out.println(Thread.currentThread().getName() + " i=" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
