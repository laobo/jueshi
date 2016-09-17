package com.java.thread;

import java.util.Random;

/**
 * Created by duanxiangchao on 2015/8/11.
 */
public class MyThread3 extends Thread {

    private Work work;

    public MyThread3(Work work){
        this.work = work;
    }

    @Override
    public void run() {
        Random random = new Random();
        Data data = new Data();
        int n1 = random.nextInt(1000);
        int n2 = random.nextInt(2000);
        int n3 = random.nextInt(3000);
        work.process(data, n1, n2, n3);  //使用回调函数
        System.out.println(String.valueOf(n1) + "+" + String.valueOf(n2) + "+" + String.valueOf(n3) + "=" + data.value);

    }

    public static void main(String [] arg){
        Thread thread = new MyThread3(new Work());
        thread.run();
    }
}

class Data{
    public int value = 0;
}

class Work{
    public void process(Data data, Integer... numbers){
        for(int n: numbers){
            data.value += n;
        }
    }
}