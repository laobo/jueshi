package com.designpattern.proxy.jdkdongtai;

import com.spring.service.*;

/**
 * Created by duanxiangchao on 2016/7/25.
 */
public class TestProxy {

    public static void main(String[] str){
        UserService userService = new UserServiceImpl();
        MyInvocationHandler invocationHandler = new MyInvocationHandler(userService);
        UserService service = (UserService) invocationHandler.getProxy();
        service.add();
    }

}
