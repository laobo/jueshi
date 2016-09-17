package com.designpattern.proxy.jdkdongtai;


/**
 * Created by duanxiangchao on 2016/7/25.
 */
public class UserServiceImpl implements UserService {

    public int add() {
        System.out.println("---------------add------------------");
        return 1;
    }
}
