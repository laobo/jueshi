package com._2016_7.thread_boke;

/**
 * Created by duanxiangchao on 2016/7/12.
 */
public class WaitAndSleep implements Runnable {

    int number = 10;

    public void firstMethod(){
        synchronized (this){
            try {
                //sleep 没有放弃对象锁    先加10
//                Thread.sleep(5000);
                //wait  放弃对象锁   后加10
                wait(5000);
                number += 10;
                System.out.println(number);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public  void secondMethod(){
        synchronized (this){
//                Thread.sleep(1000);
                number *= 10;
                System.out.println(number);
        }
    }

    public void run() {
        firstMethod();
    }

    public static void main(String[] str){
        try {
            WaitAndSleep was = new WaitAndSleep();
            Thread thread = new Thread(was);
            thread.start();
            Thread.sleep(2000);
            was.secondMethod();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
