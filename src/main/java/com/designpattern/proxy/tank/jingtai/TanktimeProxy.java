package com.designpattern.proxy.tank.jingtai;

/**
 * Created by duanxiangchao on 2016/7/25.
 */
public class TanktimeProxy implements Moveable {

    private Moveable t;

    public TanktimeProxy(Moveable t){
        super();
        this.t = t;
    }

    public void move() {
        long time1 = System.currentTimeMillis();
        System.out.println("time1:" + time1);
        t.move();
        long time2 = System.currentTimeMillis();
        System.out.println("time2:" + time2);
        System.out.println("运行时间为：" + (time2 - time1));

    }
}
