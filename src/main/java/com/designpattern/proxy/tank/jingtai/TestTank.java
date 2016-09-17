package com.designpattern.proxy.tank.jingtai;

/**
 * Created by duanxiangchao on 2016/7/25.
 */
public class TestTank {

    public static void main(String[] str){
        Tank tank = new Tank();
        Moveable tanktime = new TanktimeProxy(tank);
        Moveable moveable = new TankProxy(tanktime);
        moveable.move();
    }

}
