package com._2016_7.testthread3;

/**
 * Created by duanxiangchao on 2016/7/11.
 */
public class MyThread implements Runnable {

    private String name;
    private Object prev;
    private Object self;

    private MyThread(String name, Object prev, Object self){
        this.name = name;
        this.prev = prev;
        this.self = self;
    }

    public void run() {

        int count = 10;
        while (count > 0){
            synchronized (prev){
                synchronized (self){
                    System.out.println(Thread.currentThread().getName() + ":" + name);
                    count--;
                    self.notify();
                }
                try {
                    prev.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] str){
        Object a = new Object();
        Object b = new Object();
        Object c = new Object();

        MyThread ma = new MyThread("A", c, a);
        MyThread mb = new MyThread("B", a, b);
        MyThread mc = new MyThread("C", b, c);


        new Thread(ma).start();
        new Thread(mb).start();
        new Thread(mc).start();

    }

}
