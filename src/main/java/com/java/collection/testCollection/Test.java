package com.java.collection.testCollection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by duanxiangchao on 2015/12/15.
 */
public class Test {

    public static void main(String [] str){

        List<User> list = new ArrayList<User>();

        User user = new User();
        user.setPassword("zhangsan");

        list.add(user);

        User user1 = new User();
        user1.setName("老伯");
        user1.setPassword("laobo");

        list.add(user1);

        set(list);

        for(User u: list){
            System.out.println(u.getName() + ":" + u.getPassword());
        }

    }

    private static void set(List<User> list){
        for(User user: list){
            user.setName("haha");
            user.setPassword("hehe");
        }
    }

}
