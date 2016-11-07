package com.java.classLoader;

/**
 * Created by duanxiangchao on 2015/7/15.
 */
public class PrivateCar {

    private String color;

    protected void drive(){
        System.out.println("drive private car! The color is" + color);
    }

}
