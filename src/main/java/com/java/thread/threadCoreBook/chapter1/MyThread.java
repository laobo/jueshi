package com.java.thread.threadCoreBook.chapter1;

/**
 * Created by duanxiangchao on 2018/8/13
 */
public class MyThread extends Thread {

    int count = 20;

    public MyThread(){

    }

    public MyThread(String name){
        super();
        this.setName(name);
    }

    @Override
    synchronized public void run() {
        super.run();
//        test1();
        test2();
    }

    public void test1(){
        try {
            for(int i=0; i<10; i++){
                int time = (int)Math.random()*1000;
                Thread.sleep(time);
                System.out.println("run=" + Thread.currentThread().getName());
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void test2(){
        count--;
        System.out.println("由" + currentThread().getName() + "计算，count=" + count);
    }

}
