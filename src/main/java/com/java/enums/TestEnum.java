package com.java.enums;


import java.util.EnumMap;
import java.util.EnumSet;

/**
 * Created by duanxiangchao on 2015/11/9.
 */
public class TestEnum {

    public static void main(String [] arg){

//        testColor();

//        testColorEnum();

//        testEnumMap();

        testEnumSet();

    }

    public static void testColor(){
        System.out.println(Color.BLACK);
        for(Color color: Color.values()){
            System.out.println(color);
        }
    }

    public static void testColorEnum(){
        com.java.enums.ColorEnum red = com.java.enums.ColorEnum.RED;
        System.out.println("颜色代码：" + red.getCode());
        System.out.println("颜色描述：" + red.getValue());
        for(ColorEnum e: ColorEnum.values()){
            System.out.println(e.getCode() + ":" + e.getValue() + "---" + e.ordinal() + "---" + e.name());
        }
    }

    public static void testEnumMap(){
        EnumMap<ColorEnum, String> enumMap = new EnumMap<ColorEnum, String>(ColorEnum.class);
        enumMap.put(ColorEnum.BLANK, "黑色的！");
        enumMap.put(ColorEnum.GREEN, "绿色的！");
        for(ColorEnum e: ColorEnum.values()){
            System.out.println("code:" + e.getCode() + ",value:" + enumMap.get(e));
        }
    }

    public static void testEnumSet(){
        EnumSet<ColorEnum> enumSet = EnumSet.allOf(ColorEnum.class);
        for(ColorEnum e: enumSet){
            System.out.println("当前EnumSet中的数据为："+e);
        }
    }

}
