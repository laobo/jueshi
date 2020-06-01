package com.java.thread.threadCoreBook.chapter2.t9;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by duanxiangchao on 2018/8/30
 */
public class MyOneList {

    private List list = new ArrayList();

    synchronized public void add(String data){
        list.add(data);
    }

    synchronized public int getSize(){
        return list.size();
    }

}
