package com.designpattern.singlton;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by duanxiangchao on 2016/7/24.
 */
public class RegSingleton {
    /**
     * 登记薄，用来存放所有登记的实例
     */
    private static Map<String, RegSingleton> registry = new HashMap<String, RegSingleton>();

    /**
     * 类加载时添加一个实例到登记薄
     */
    static {
        RegSingleton singleton = new RegSingleton();
        registry.put(singleton.getClass().getName(), singleton);
    }
    /**
     * 受保护的默认构造方法
     */
    protected RegSingleton(){}

    /**
     * 静态工厂方法，返回指定登记对象的唯一实例
     * 对于已登记的直接取出返回，对于还未登记的，先登记，后取出返回
     * @param name
     * @return
     */
    public static RegSingleton getInstance(String name){
        if(name == null){
            name = "RegSingleton";
        }
        if(registry.get(name) == null){
            try {
                registry.put(name, (RegSingleton)Class.forName(name).newInstance());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return registry.get(name);
    }

}
