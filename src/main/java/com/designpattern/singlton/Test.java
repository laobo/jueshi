package com.designpattern.singlton;

/**
 * Created by duanxiangchao on 2016/7/26.
 */
public class Test {
    public static void main(String[] str){
        //调用枚举单例的方法
        EnumSingleton.INSTANCE.operate();

        ConfigSingleton singleton = ConfigSingleton.getInstance();

        System.out.println(singleton.get("laobo"));

    }
}
