package com.java.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by duanxiangchao on 2015/8/5.
 */
public class Test {

    public static void main(String [] str){

//        testArrayList();
//        linkedList();

//        testZhan();

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        System.out.println("current classLoader: " + classLoader);
        System.out.println("Parent ClassLoader: " + classLoader.getParent());
        System.out.println("grandParent ClassLoader: " + classLoader.getParent().getParent());

    }

    public static void testArrayList(){
        ArrayList<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(4);
        List<Integer> cloneList = (List<Integer>)list.clone();
        for(Integer nu: cloneList){
            System.out.println(nu);
        }
        for(int i = list.size()-1; i>=0; i--){
            if(list.get(i).equals(3))
                list.remove(i);
        }
        System.out.println(list);
    }

    public static void testYouyi(){
        int h = 8 ;
        System.out.println(8 >>> 2);
        System.out.println(8 >>> 1);
        System.out.println((8 >>> 2) ^ (8 >>> 1));
        System.out.println(8 ^ (8 >>> 2) ^ (8 >>> 1));
        h ^= (h >>> 2) ^ (h >>> 1);
        System.out.println(h);
    }

    public static void linkedList(){
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("First");
        linkedList.add("Second");
        linkedList.add("Thrid");
        System.out.println(linkedList);

        ListIterator<String> itr = linkedList.listIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        try{
            System.out.println(itr.next());
        }catch (Exception e){

        }

        System.out.println("================================");
        itr = linkedList.listIterator();
        System.out.println(itr.next());

        System.out.println(linkedList);
        itr.add("new model1");
        System.out.println(linkedList);
        itr.add("new model2");
        System.out.println(linkedList);
        System.out.println(itr.next());
        itr.set("modify node");
        System.out.println(linkedList);
        itr.remove();
        System.out.println(linkedList);

    }

    public static void testZhan(){
        add(1000000000);
    }

    public static int add(int a){
        if(a == 0){
            return 0;
        }else {
            return  add(a-1);
        }
    }

}
