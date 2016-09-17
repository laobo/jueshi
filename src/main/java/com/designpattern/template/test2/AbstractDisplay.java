package com.designpattern.template.test2;

/**
 * Created by duanxiangchao on 2016/8/16.
 */
public abstract class AbstractDisplay {

    public abstract void open();

    public abstract void print();

    public abstract void close();

    public final void display(){
        open();
        for(int i = 0; i < 5; i++){
            print();
        }
        close();
    }

}
