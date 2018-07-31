package com.designpattern.observer.test1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by duanxiangchao on 2018/5/25
 */
public class WechatServer implements Observable {

    private List<Observer> list;

    private String message;

    public WechatServer() {
        list = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        list.add(o);
    }

    public void removeObserver(Observer o) {
        list.remove(o);
    }

    public void notifyObserver() {
        for(Observer observer: list){
            observer.update(message);
        }
    }

    public void setInformation(String s){
        this.message = s;
        System.out.println("微信服务更新消息：" + s);
        notifyObserver();
    }
}
