package com.designpattern.observer.test3;

import java.util.Date;

/**
 * Created by duanxiangchao on 2018/5/26
 */
public class Observer1 {

    public Observer1(){
        System.out.println("Observer1 状态 1 ！");
    }

    public void changeState1(Date date){
        System.out.println("Observer1 改变状态：" + date);
    }

}
