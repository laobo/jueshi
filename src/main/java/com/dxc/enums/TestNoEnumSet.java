package com.dxc.enums;

/**
 * Created by duanxiangchao on 2015/11/9.
 */
public class TestNoEnumSet {

    public static void main(String [] arg){

        int  myFavoriteFoods = OldFoods.Pasta | OldFoods.Hamburger | OldFoods.Bread | OldFoods.Rice;
        boolean answer = (myFavoriteFoods & OldFoods.Fruit) != 0;
        System.out.printf("Do you like eat fruit? s%\n", answer ? "Yes" : "No");
        answer = (myFavoriteFoods & OldFoods.Hamburger) != 0;
        System.out.printf("Do you like eat hamburger? s%\n", answer ? "Yes" : "No");
    }

}

class OldFoods{
    public static final int Fruit = 0x01;
    public static final int Rice = 0x02;
    public static final int Noodles = 0x04;
    public static final int Hamburger  = 0x08;
    public static final int Pasta  = 0x10;
    public static final int Cake  = 0x20;
    public static final int Bread = 0x40;

}