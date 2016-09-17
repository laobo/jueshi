package com._2016_7.testthread2;

/**
 * Created by duanxiangchao on 2016/7/11.
 */
public class InsertData {

    public synchronized void insert(){
        System.out.println("执行insert");
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("执行insert完毕");
    }

    public synchronized static void insert1(){
        System.out.println("执行insert1");
        System.out.println("执行insert1完毕");
    }

}
