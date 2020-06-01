package com.java.thread.threadCoreBook.chapter1;

/**
 * Created by duanxiangchao on 2018/8/13
 */
public class Run1 {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Run1Thread run1Thread = new Run1Thread();
        run1Thread.start();
    }

}

class Run1Thread extends Thread{

    public Run1Thread(){
        System.out.println("构造方法打印：" + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("run方法答应：" + Thread.currentThread().getName());
    }
}
