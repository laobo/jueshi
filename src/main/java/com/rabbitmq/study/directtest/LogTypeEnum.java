package com.rabbitmq.study.directtest;

/**
 * Created by duanxiangchao on 2018/5/23
 */
public enum LogTypeEnum {

    INFO("info"),
    WARING("waring"),
    ERROR("error");

    //成员变量
    private String value;

    //构造方法，私有
    private LogTypeEnum(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
