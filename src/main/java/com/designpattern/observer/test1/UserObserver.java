package com.designpattern.observer.test1;

/**
 * Created by duanxiangchao on 2018/5/25
 */
public class UserObserver implements Observer {

    private String name;

    private String message;

    public UserObserver(String name){
        this.name = name;
    }

    public void update(String message) {
        this.message = message;
        read();
    }

    public void read(){
        System.out.println(name + "收到推送消息：" + message);
    }

}
