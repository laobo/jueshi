package com.thread.test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by duanxiangchao on 2016/7/30.
 */
public class Threads1 {

    static ExecutorService executorService = Executors.newFixedThreadPool(1);

    public static void main(String arg[]){
        SubThread subThread = new SubThread();
        Future future = executorService.submit(subThread);
        mainWork();
        System.out.println("now waiting subthread done!");
        try {
            future.get();
            System.out.println("now all done!");
            executorService.shutdown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        ;
    }

    private static void mainWork(){
        try {
            System.out.println("main thread start work!");
            Thread.sleep(3000);
            System.out.println("main thread end work!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}


