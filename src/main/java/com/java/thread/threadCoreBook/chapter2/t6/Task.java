package com.java.thread.threadCoreBook.chapter2.t6;

/**
 * Created by duanxiangchao on 2018/8/22
 */
public class Task {

    private String getData1;

    private String getData2;

    public void doLongTimeTask(){
        try {
            System.out.println("Begin task");
            Thread.sleep(3000);
            String privateGetData1 = "长时间处理任务后从远程返回值 1 threadName=" + Thread.currentThread().getName();
            String privateGetData2 = "长时间处理任务后从远程返回值 2 threadName=" + Thread.currentThread().getName();
            synchronized (this){
                getData1 = privateGetData1;
                getData2 = privateGetData2;
            }
            System.out.println(getData1);
            System.out.println(getData2);
            System.out.println("End task");
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
