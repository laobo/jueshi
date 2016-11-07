package com.java.thread.basic;

/**
 * Created by duanxiangchao on 2015/8/11.
 */
public class Sync extends Thread {

    private Test test;

    public Sync(Test test){
        this.test = test;
    }

    @Override
    public void run(){
        test.method();
    }

    public static void main(String []arg){
        Test test1 = new Test();
        Test test2 = new Test();
        Sync sync1 = new Sync(test1);
        Sync sync2 = new Sync(test2);
        new Thread(sync1).start();
        new Thread(sync2).start();
    }



}

class Test{
    public synchronized void method(){

    }
}
