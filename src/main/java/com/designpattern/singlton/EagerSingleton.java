package com.designpattern.singlton;

/**
 * Created by duanxiangchao on 2016/7/24.
 * 饿汉式单例
 */
public class EagerSingleton {
    /**
     * 私有的唯一实例成员，在类加载的时候创建好了单例对象
     */
    private static final EagerSingleton instance = new EagerSingleton();

    /**
     * 私有构造方法，避免外部创建实例
     */
    private EagerSingleton(){}

    /**
     * 静态工厂方法，返回此类的唯一实例
     * @return  EagerSingleter
     */
    public static EagerSingleton getInstance(){
        return instance;
    }

}
