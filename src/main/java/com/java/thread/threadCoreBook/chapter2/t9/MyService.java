package com.java.thread.threadCoreBook.chapter2.t9;

/**
 * Created by duanxiangchao on 2018/8/30
 */
public class MyService {

    public MyOneList addServiceMethod(MyOneList list, String data){
        if(list.getSize() < 1){
            try {
                Thread.sleep(2000);
                list.add(data);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

}
