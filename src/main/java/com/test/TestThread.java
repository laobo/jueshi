package com.test;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by duanxiangchao on 2016/8/11.
 */
public class TestThread {

    public static void main(String[]arg){

        final AtomicInteger i = new AtomicInteger(0);
        for(int k = 0; k < 4; k ++){
            new Thread(){
                @Override
                public void run() {
                    for(int j = 0; j < 100; j++){
                        i.addAndGet(1);
                    }
                }
            }.start();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(i);

    }

}
