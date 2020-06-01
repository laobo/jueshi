package com;

import com.google.common.collect.Lists;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by duanxiangchao on 2020/5/22
 */
public class Mianshi {

    Integer first;

    int second;

    String three;

    public Mianshi(){
        System.out.print("B");
        three = "s";
    }

    public static void main(String[] args) {

        Mianshi mianshi = new Mianshi();
        System.out.println(mianshi.first);
        System.out.println(mianshi.second);
        System.out.println(mianshi.three);

        test();

    }

    public static void test(){
        List<Integer> numberList = new ArrayList<>(4);
        numberList.add(1);
        numberList.add(5);
        numberList.add(3);

        Collections.sort(numberList);
        numberList.set(3, 2);
        Collections.reverse(numberList);
        System.out.println(numberList);

    }

}
