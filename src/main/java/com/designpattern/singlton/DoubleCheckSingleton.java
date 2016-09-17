package com.designpattern.singlton;

/**
 * Created by duanxiangchao on 2016/7/26.
 */
public class DoubleCheckSingleton {

    private volatile static DoubleCheckSingleton instance = null;

    private DoubleCheckSingleton(){}

    public static DoubleCheckSingleton getInstance(){
        //先检查实例是否存在，不存在则进入下面的同步块
        if(instance == null){
            //同步块，线程安全的创建实例
            synchronized (DoubleCheckSingleton.class){
                //再次检查是否存在实例，如果不存在，才真正创建实例
                if(instance == null){
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }

}
