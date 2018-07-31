package com.designpattern.observer.test2;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by duanxiangchao on 2018/5/25
 */
public class GlobalTimes extends NewspaperOffice implements Observer {

    private Observable observable;

    public GlobalTimes(SpecialReporter reporter){
        this.observable = reporter;
        reporter.addObserver(this);
    }

    public void update(Observable o, Object arg) {
        if(o instanceof SpecialReporter){
            System.out.println("Global Times:" + ((SpecialReporter) o).getMessage());
        }
    }

}
