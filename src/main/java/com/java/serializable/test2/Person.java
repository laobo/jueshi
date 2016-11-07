package com.java.serializable.test2;

import java.io.Serializable;

/**
 * Created by duanxiangchao on 2016/1/6.
 */
public class Person implements Serializable {

    private static final long serialVersionUID = -5809782578272943999L;

    private String name;
    private String sex;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
