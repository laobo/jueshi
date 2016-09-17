package com._2016_7.thread_boke;

/**
 * Created by duanxiangchao on 2016/7/12.
 */
public class NumberHolder {

    private int number;

    public NumberHolder(int number){
        this.number = number;
    }

    public synchronized void increase(){

        while (0 != number){
            try {
                wait();
                System.out.println(Thread.currentThread().getName() + "等待");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //执行到这里说明已经被唤醒   number=0
        number++;
        NumberTest.count++;
        System.out.println(NumberTest.count + ":" +Thread.currentThread().getName() + "number加法:" + number);
        notify();
    }

    public synchronized void decrease(){
        while(number == 0){
            try {
                wait();
                System.out.println(Thread.currentThread().getName() + "等待");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //执行到这里说明已经被唤醒    number!=0
        number--;
        NumberTest.count++;
        System.out.println(NumberTest.count + ":" + Thread.currentThread().getName() + "number减法:" + number);
        notify();
    }

}
