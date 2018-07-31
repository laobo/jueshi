package com.designpattern.observer.test3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by duanxiangchao on 2018/5/26
 */
public class Event {

    private Object object;

    private String methodName;

    private Object[] params;

    private Class[] paramsType;


    public Event(Object object, String methodName, Object... args){
        this.object = object;
        this.methodName = methodName;
        this.params = args;

    }

    /**
     * @description: 获取类型方法的参数类型集合
     * @author duanxiangchao
     * @date 2018/5/26 下午5:30
     */
    private void contractParamTypes(Object[] params2){
        this.paramsType = new Class[params2.length];
        for(int i = 0; i < params2.length; i++){
            this.paramsType[i] = params2[i].getClass();
        }
    }


    public void invoke() throws Exception {
        //根据方法名、参数集合获取方法
        Method method = object.getClass().getMethod(this.methodName, this.paramsType);
        if(null == method){
            return;
        }
        method.invoke(this.object, this.params);
    }


}
