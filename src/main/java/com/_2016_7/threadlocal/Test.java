package com._2016_7.threadlocal;

/**
 * Created by duanxiangchao on 2016/7/21.
 */
public class Test {

    public static void main(String[] str){
        TestUser testUser = new TestUser();
        testUser.setAge(5);

        if(testUser == null || testUser.getAge() == 0){
            System.out.println(0);
        }else {
            System.out.println(1);
        }

    }

}
