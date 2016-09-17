package com.java.thread;

/**
 * Created by duanxiangchao on 2015/8/11.
 */
public class SingletonThread extends Thread {

    @Override
    public void run() {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.hashCode());
    }

    public static void main(String [] arg){

        Thread thread[] = new Thread[5];
        for(int i = 0; i < 5; i++){
            thread[i] = new SingletonThread();
        }
        for(int i = 0; i < 5; i++){
            thread[i].start();
        }

    }

}

class Singleton{

    private static Singleton sample;

    private Singleton(){}

    public static synchronized Singleton getInstance(){
        if(sample == null){
            sample = new Singleton();
        }
        return sample;
    }

}