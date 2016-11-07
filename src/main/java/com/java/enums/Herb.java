package com.java.enums;

/**
 * Created by duanxiangchao on 2015/11/9.
 */
public class Herb {

    public enum Type{
        ANNUAL, TWOYEARS, PERENNIAL
    }

    private final String name;
    private final Type type;

    public Herb(String name, Type type){
        this.name = name;
        this.type = type;
    }

    public Type getType(){
        return type;
    }

    @Override
    public String toString() {
        return name;
    }
}
