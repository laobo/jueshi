package com.java.random;

import java.util.Random;

/**
 * Created by duanxiangchao on 2018/7/19
 */
public class TestRandom {

    public static void main(String[] args) {
        Random random = new Random();
        for(int i=0; i<20; i++){
            System.out.println(random.nextInt(5));
        }
    }

}
