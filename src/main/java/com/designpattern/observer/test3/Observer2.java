package com.designpattern.observer.test3;

import java.util.Date;

/**
 * Created by duanxiangchao on 2018/5/26
 */
public class Observer2 {

    public Observer2(){
        System.out.println("Observer2 状态 2 !");
    }

    public void changeState2(Date date){
        System.out.println("Observer2 改变状态：" + date);
    }

}
