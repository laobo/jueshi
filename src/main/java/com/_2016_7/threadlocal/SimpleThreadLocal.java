package com._2016_7.threadlocal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by duanxiangchao on 2016/7/21.
 */
public class SimpleThreadLocal {

    private Map valueMap = Collections.synchronizedMap(new HashMap());

    private void set(Object newValue){
        valueMap.put(Thread.currentThread(), newValue);
    }

    public Object get(){
        Thread currentThread = Thread.currentThread();
        Object o = valueMap.get(currentThread);
        if(o == null && !valueMap.containsKey(currentThread)){
//            o.initalValue();
            valueMap.put(currentThread, o);
        }
        return o;
    }

    public void remove(){
        valueMap.remove(Thread.currentThread());
    }

    public Object initalValue(){
        return null;
    }

}
