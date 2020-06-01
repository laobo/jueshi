package com.java.thread.threadCoreBook.chapter1.interrupt_173;

/**
 * Created by duanxiangchao on 2018/8/14
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        try {
            for(int i=0; i<500000; i++){
                if(this.isInterrupted()){
                    System.out.println("已经是停滞状态了！我要退出了！");
                    throw new InterruptedException();
                }
                System.out.println("i=" + (i + 1));
            }
            System.out.println("我被输出，如果此代码是for又继续运行，线程并未停止！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
