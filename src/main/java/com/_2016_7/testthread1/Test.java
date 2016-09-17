package com._2016_7.testthread1;

/**
 * Created by duanxiangchao on 2016/7/11.
 */
public class Test {

    public static void main(String[] str){
        final InsertData insertData = new InsertData();

        new Thread(){
            @Override
            public void run() {
                insertData.insertDate(Thread.currentThread());
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                insertData.insertDate(Thread.currentThread());
            }
        }.start();

    }

}
