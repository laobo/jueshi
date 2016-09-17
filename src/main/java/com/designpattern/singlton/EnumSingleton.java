package com.designpattern.singlton;

/**
 * Created by duanxiangchao on 2016/7/26.
 * 枚举式单例
 */
public enum EnumSingleton {

    /**
     * 单例实例
     */
    INSTANCE;

    /**
     * 示例方法
     */
    public void operate(){
        System.out.println("单例操作......");
    }

}
