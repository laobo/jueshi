package com.designpattern.observer.test2;

import java.util.Observable;

/**
 * Created by duanxiangchao on 2018/5/25
 * 被观察者实体，持有观察者的集合！
 */
public class SpecialReporter extends Observable {

    private String message;

    public void getNewNews(String message){
        this.message = message;
        this.setChanged();
        //观察者调用顺序不确定
        this.notifyObservers();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
