package com.designpattern.template.test2;

/**
 * Created by duanxiangchao on 2016/8/16.
 */
public class Main {

    public static void main(String[]arg){
        AbstractDisplay ch = new CharDisplay('A');
        AbstractDisplay str = new StringDisplay("Hello world!");
        ch.display();
        str.display();
    }

}
