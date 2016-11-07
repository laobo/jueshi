package com.testHello;


/**
 * Created by duanxiangchao on 16/11/1.
 */
public class HelloImpl implements IHello {
    public String sayHello(String name) {
        return "Hello " + name + "!";
    }
}
