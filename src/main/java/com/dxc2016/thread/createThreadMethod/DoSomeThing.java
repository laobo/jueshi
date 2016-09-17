package com.dxc2016.thread.createThreadMethod;

/**
 * Created by duanxiangchao on 2016/6/17.
 */
public class DoSomeThing implements Runnable {

    private String name;

    public DoSomeThing(String name){
        this.name=name;
    }

    public void run() {

        for(int i=0; i<5; i++){
//            for(long k=0; k<10000000; k++);
            System.out.println(name + ":" + i);
        }

    }
}
