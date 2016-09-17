package com.java.threadMianShi;

/**
 * Created by duanxiangchao on 2015/8/30.
 */
public class Test {

    private int i = 10;

    private synchronized void inc(){
        i ++;
        System.out.println(Thread.currentThread().getName() + "inc++ : " + i);
    }

    private synchronized void dec(){
        i --;
        System.out.println(Thread.currentThread().getName() + "inc-- : " + i);
    }

    class Inc implements Runnable{

        public void run() {
            inc();
        }
    }

    class Dec implements Runnable{

        public void run() {
            dec();
        }
    }

    public static void main(String[] str){

        Test test = new Test();
        Inc inc = test.new Inc();
        Dec dec = test.new Dec();

        Thread thread = null;

        for(int i = 0; i < 2; i++){
            thread = new Thread(inc);
            thread.start();
            thread = new Thread(dec);
            thread.start();
        }

    }

}
