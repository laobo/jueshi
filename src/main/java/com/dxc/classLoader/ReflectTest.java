package com.dxc.classLoader;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by duanxiangchao on 2015/7/15.
 */
public class ReflectTest {

    public static void main(String[]str) throws Throwable {
        Car car = initByDefaultConst();
        car.introduce();
    }

    public static Car initByDefaultConst() throws Throwable {

        //通过类装载器获取car类对象
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class clazz = loader.loadClass("com.dxc.classLoader.Car");

        //获取类的默认构造器对象并通过它实例化Car
        Constructor cons = clazz.getDeclaredConstructor((Class[])null);
        Car car = (Car) cons.newInstance();

        //通过反射方法设置属性
        Method setBrand = clazz.getMethod("setBrand",String.class);
        System.out.println("setBrand方法返回值类型：" + setBrand.getReturnType());
        setBrand.invoke(car,"红旗CA72");
        Method setColor = clazz.getMethod("setColor",String.class);
        setColor.invoke(car,"黑色");
        Method setMaxSpeed = clazz.getMethod("setMaxSpeed", int.class);
        setMaxSpeed.invoke(car, 200);
        return car;
    }

}
