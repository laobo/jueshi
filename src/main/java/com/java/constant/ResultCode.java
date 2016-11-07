package com.java.constant;

/**
 * Created by duanxiangchao on 2015/11/20.
 */
public class ResultCode {

    public String code;
    public String message;

    private ResultCode(String code,String message){
        this.code = code;
        this.message = message;
    }

    public static final ResultCode SUCCESS = new ResultCode("S00000", "成功");
    public static final ResultCode SYSTEM_ERROR = new ResultCode("E00001","系统错误");

}
