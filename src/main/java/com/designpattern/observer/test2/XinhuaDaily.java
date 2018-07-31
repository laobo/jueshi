package com.designpattern.observer.test2;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by duanxiangchao on 2018/5/25
 * 观察者实体
 */
public class XinhuaDaily extends NewspaperOffice implements Observer {

    /**
     * 观察者持有被观察者
     */
    private Observable observable;

    public XinhuaDaily(SpecialReporter reporter){
        this.observable = reporter;
        reporter.addObserver(this);
    }

    public void update(Observable o, Object arg) {
        if(o instanceof SpecialReporter){
            System.out.println("Xinhua Daily:" + ((SpecialReporter) o).getMessage());
        }
    }

}
