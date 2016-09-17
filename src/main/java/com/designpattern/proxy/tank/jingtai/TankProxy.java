package com.designpattern.proxy.tank.jingtai;

/**
 * Created by duanxiangchao on 2016/7/25.
 */
public class TankProxy implements Moveable {

    private Moveable t;

    public TankProxy(Moveable t){
        this.t = t;
    }

    public void move() {
        System.out.println("start move ......");
        t.move();
        System.out.println("end move ......");
    }
}
