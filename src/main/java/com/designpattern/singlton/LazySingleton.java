package com.designpattern.singlton;

/**
 * Created by duanxiangchao on 2016/7/24.
 * 懒汉式单例
 */
public class LazySingleton {
    /**
     * 私有静态对象，加载时不做初始化
     */
    private static LazySingleton instance = null;

    /**
     * 构造方法私有化，避免外部创建实例
     */
    private LazySingleton(){}

    /**
     * 静态工厂犯法，如果没有实例则初始化，返回唯一实例
     * @return LazySingleton
     */
    private static synchronized LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }

}
