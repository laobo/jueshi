package com.designpattern.observer.test1;

/**
 * Created by duanxiangchao on 2018/5/25
 */
public class TestObserver {

    public static void main(String[] args) {

        WechatServer wechatServer = new WechatServer();

        Observer zhangsan = new UserObserver("zhangsan");
        Observer lisi = new UserObserver("lisi");
        Observer wangwu = new UserObserver("wangwu");

        wechatServer.registerObserver(zhangsan);
        wechatServer.registerObserver(lisi);
        wechatServer.registerObserver(wangwu);
        wechatServer.setInformation("PHP是世界上最好的语言！");

        System.out.println("----------------------");
        wechatServer.removeObserver(lisi);
        wechatServer.setInformation("JAVA是世界上最好的语言！");


    }

}
