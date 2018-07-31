package com.designpattern.observer.test3;

/**
 * Created by duanxiangchao on 2018/5/26
 */
public abstract class Notifier {

    private EventHandler eventHandler = new EventHandler();

    public abstract void attach(Object object, String methodName, Object... args);

    public abstract void notifyObj();

    public EventHandler getEventHandler() {
        return eventHandler;
    }

    public void setEventHandler(EventHandler eventHandler) {
        this.eventHandler = eventHandler;
    }
}
