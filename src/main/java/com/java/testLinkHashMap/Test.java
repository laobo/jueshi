package com.java.testLinkHashMap;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by duanxiangchao on 2015/12/29.
 */
public class Test {

    public static void main(String[] str){
        List<User> list = new ArrayList<User>();
        for(int i = 0; i <10; i++ ){
            User user = new User();
            user.setId(i);
            list.add(user);
        }
        LinkedHashMap<Integer, User> map = new LinkedHashMap<Integer, User>();
        for(User user: list){
            map.put(user.getId(), user);
        }
        for(User user: list){
            map.get(user.getId()).setName("zhangsan" + user.getId());
            map.get(user.getId()).setPassword("lisi" + user.getId());
        }
        for(User user: list){
            System.out.println( user.getId() + ":" + user.getName() + "," + user.getPassword());
        }

        System.out.println("========================================");
        List<Integer> l = new ArrayList<Integer>();
        for(int i=0;i<10;i++){
            l.add(i);
        }
        for(Integer i: l.subList(10,10)){
            System.out.println(i);

        }

    }

}
