package com.dxc;

/**
 * Created by duanxiangchao on 2015/12/1.
 */
public class User {

    private String name = "zhangsan";
    private String password;

    enum type{

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
