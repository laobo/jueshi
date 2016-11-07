package com.java.sanmu;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by duanxiangchao on 2015/6/26.
 */
public class TestInteger {

    public static void main(String [] str){

        Map map = new HashMap<String, Object>();
        AClass aClass = new AClass();
        Integer test = map.get("b")==null? aClass.getA(): (Integer)3;
        System.out.println(test);

    }

}
