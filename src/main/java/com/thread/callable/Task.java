package com.thread.callable;

import java.util.concurrent.Callable;

/**
 * Created by duanxiangchao on 2016/7/30.
 */
public class Task implements Callable<Integer> {

    public Integer call() throws Exception {
        System.out.println("子线程在进行计算！");
        Thread.sleep(3000);
        int sum = 0;
        for(int i = 0; i < 100; i++){
            sum += i;
        }
        System.out.println("运行完毕！");
        return sum;
    }

}
