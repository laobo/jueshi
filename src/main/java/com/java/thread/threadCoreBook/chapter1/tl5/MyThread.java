package com.java.thread.threadCoreBook.chapter1.tl5;

/**
 * Created by duanxiangchao on 2018/8/14
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        try {
            for(int i=0; i<10000; i++){
                System.out.println("i=" + (i + 1));
            }
            System.out.println("run begin");
            System.out.println(System.currentTimeMillis());
            Thread.sleep(200000);
            System.out.println("run end");
        } catch (InterruptedException e){
            System.out.println("先停止，再遇到sleep!进入catch!");
            e.printStackTrace();
        }
    }
}
