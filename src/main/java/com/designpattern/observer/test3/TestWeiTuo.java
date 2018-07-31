package com.designpattern.observer.test3;

import java.util.Date;

/**
 * Created by duanxiangchao on 2018/5/26
 */
public class TestWeiTuo {

    public static void main(String[] args) {
        Notifier notifier = new ConcreteNotifier();
        notifier.attach(new Observer1(), "changeState1", new Date());

        notifier.attach(new Observer2(), "changeState2", new Date());
    }

}
