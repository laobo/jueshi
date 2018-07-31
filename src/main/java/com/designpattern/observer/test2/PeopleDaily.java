package com.designpattern.observer.test2;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by duanxiangchao on 2018/5/25
 */
public class PeopleDaily extends NewspaperOffice implements Observer {

    private Observable observable;

    /**
     * 观察者构造方法，传入被观察者
     * @param reporter
     */
    public PeopleDaily(SpecialReporter reporter){
        this.observable = reporter;
        //把自身添加到被观察者的观察者集合中
        reporter.addObserver(this);
    }

    public void update(Observable o, Object arg) {
        if(o instanceof SpecialReporter){
            System.out.println("People's Daily:" + ((SpecialReporter) o).getMessage());
        }
    }

    public void remove() {
        observable.deleteObserver(this);
    }

}
