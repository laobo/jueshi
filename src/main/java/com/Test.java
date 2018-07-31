package com;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by duanxiangchao on 2018/6/28
 */
public class Test {

    public static String getAmount(Integer amount){
        if(amount < 10000){
            return amount.toString();
        }
        if(amount % 10000 < 1000){
            return amount / 10000 + "万";
        }
        BigDecimal bigDecimal = new BigDecimal(amount);
        return bigDecimal.divide(new BigDecimal(10000)).setScale(1, RoundingMode.HALF_DOWN).toString() + "万";
    }

    public static void main(String[] args) {
        System.out.println(getAmount(9000));
    }

}
