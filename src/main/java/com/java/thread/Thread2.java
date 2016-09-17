package com.java.thread;

/**
 * Created by duanxiangchao on 2015/8/11.
 */
public class Thread2 extends Thread {

    private String who;

    public Thread2(String who){
        super();
        this.who = who;
    }

    public Thread2(String who, String name){
        super(name);
        this.who = who;
    }

    @Override
    public void run() {
        System.out.println(who + ":" +this.getName());
    }

    public static void main(String [] str){
        Thread2 thread1 = new Thread2("thread1", "MyThread1");
        Thread2 thread2 = new Thread2("thread2");
        Thread2 thread3 = new Thread2("thread3");
        thread2.setName("MyThread2");
        thread1.run();
        thread2.run();
        thread3.run();
    }


}
