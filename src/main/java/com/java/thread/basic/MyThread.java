package com.java.thread.basic;

/**
 * Created by duanxiangchao on 2015/8/11.
 */
public class MyThread extends Thread {

    class SleepThread extends Thread{
        @Override
        public void run() {
            try {
                sleep(2000);
                System.out.println(123123);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        while(true){
            System.out.println(new java.util.Date().getTime());
        }
    }

    public static void main(String [] str) throws InterruptedException {
        MyThread thread = new MyThread();
        SleepThread sleepThread = thread.new SleepThread();
        sleepThread.start();  //开始运行sleepThread线程
        sleepThread.join();   //使线程sleepThread延迟2秒
        thread.start();
        boolean flag = false;
        while(true){
            sleep(1000);
            flag = !flag;
            if(flag){
                thread.suspend();   //挂起线程
            }else{
                thread.resume();    //唤醒线程
            }
        }
    }

}
