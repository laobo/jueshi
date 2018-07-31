package com.designpattern.observer.test3;

/**
 * Created by duanxiangchao on 2018/5/26
 */
public class ConcreteNotifier extends Notifier {

    public void attach(Object object, String methodName, Object... args) {
        this.getEventHandler().addEvent(object, methodName, args);
    }

    public void notifyObj() {
        try {
            this.getEventHandler().notifyObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
