package com._2016_7.testthread1;

import java.util.ArrayList;

/**
 * Created by duanxiangchao on 2016/7/11.
 */
public class InsertData {

    private ArrayList<Integer> list = new ArrayList<Integer>();

    public synchronized void insertDate(Thread thread){
        for(int i = 0; i<1000; i++){
            System.out.println(thread.getName() + "在插入数据" + i);
            list.add(i);
        }
    }

}
