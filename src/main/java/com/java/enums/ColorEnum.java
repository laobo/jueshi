package com.java.enums;

/**
 * Created by duanxiangchao on 2015/11/9.
 */
public enum ColorEnum {

    RED(1, "红色"),
    GREEN(2, "绿色"),
    BLANK(3, "白色"),
    YELLO(4, "黄色");

    //成员变量
    private int code;
    private String value;


    //构造方法，私有
    private ColorEnum(int code, String value){
        this.code = code;
        this.value = value;
    }

    public int getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }

    public static ColorEnum value(int code){
        for(ColorEnum e: values()){
            if(e.code == code){
                return e;
            }
        }
        return null;
    }

}
