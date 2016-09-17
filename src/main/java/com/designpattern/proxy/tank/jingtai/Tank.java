package com.designpattern.proxy.tank.jingtai;

/**
 * Created by duanxiangchao on 2016/7/25.
 */
public class Tank implements Moveable {
    public void move() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Tank moving ......");
    }
}
