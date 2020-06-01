package com.java.thread.threadCoreBook.chapter2.synLockIn_2;

/**
 * Created by duanxiangchao on 2018/8/20
 */
public class Sub extends Main {

    synchronized public void operatISubMethod(){
        try {
            while (i > 0){
                System.out.println("sub print i=" + i);
                Thread.sleep(100);
                this.operateIMainMethod();
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
