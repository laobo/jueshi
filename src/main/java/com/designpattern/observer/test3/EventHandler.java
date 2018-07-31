package com.designpattern.observer.test3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by duanxiangchao on 2018/5/26
 */
public class EventHandler {

    private List<Event> objects;


    public EventHandler(){
        objects = new ArrayList<Event>();
    }

    /**
     * @description: 添加事件
     * @author duanxiangchao
     * @date 2018/5/26 下午5:31
     */
    public void addEvent(Object object, String method, Object... args){
        objects.add(new Event(object, method, args));
    }

    /**
     * @description: 执行方法
     * @author duanxiangchao
     * @date 2018/5/26 下午5:31
     */
    public void notifyObject() throws Exception {
        for(Event event: objects){
            event.invoke();
        }
    }

}
