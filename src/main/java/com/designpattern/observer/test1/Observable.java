package com.designpattern.observer.test1;

/**
 * Created by duanxiangchao on 2018/5/25
 */
public interface Observable {

    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObserver();

}
