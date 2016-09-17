package com.jconsole;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by duanxiangchao on 2016/7/19.
 */
public class TestConsole {

    public static void main(String[] str){
        byte[] bytes = new byte[64 * 1024];
        List list = new ArrayList<Object>();
        for(int i = 0; i < 10000; i++){
            try {
                Thread.sleep(1000);
                list.add(bytes);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
