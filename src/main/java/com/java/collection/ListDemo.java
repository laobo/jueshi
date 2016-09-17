package com.java.collection;

import java.util.*;

/**
 * Created by duanxiangchao on 2015/7/24.
 */
public class ListDemo {

    private static final int COUNT = 100000;
    private static LinkedList linkedList = new LinkedList();
    private static ArrayList arrayList = new ArrayList();
    private static Vector vector = new Vector();
    private static Stack stack = new Stack();

    public static void main(String [] str){

        //插入100000元素耗时
        insertByPosition(arrayList);
        insertByPosition(linkedList);
        insertByPosition(vector);
        insertByPosition(stack);

        System.out.println();

        //随机读取  耗时
        readByPosition(arrayList);
        readByPosition(linkedList);
        readByPosition(vector);
        readByPosition(stack);

        //从首位删除
        deleteByPosition(arrayList);
        deleteByPosition(linkedList);
        deleteByPosition(vector);
        deleteByPosition(stack);

    }

    //获取参数类型
    public static String getListName(List list){
        if(list instanceof LinkedList){
            return "LinkedList";
        }else if(list instanceof ArrayList){
            return "ArrayList";
        }else if(list instanceof Stack){
            return "Stack";
        }else if(list instanceof Vector){
            return "Vector";
        }else{
            return "List";
        }
    }

    //插入元素
    public static void insertByPosition(List list){
        long startTime = System.currentTimeMillis();
        for(int i = 0;i<100000;i++){
            list.add(0,i);
        }
        long endTime = System.currentTimeMillis();
        long valueTime = endTime - startTime;
        System.out.println(getListName(list)+"插入"+COUNT+"条记录用时："+valueTime+"ms");
    }

    //随机读取
    public static void readByPosition(List list){
        long startTime = System.currentTimeMillis();
        for(int i = 0;i<list.size();i++){
            list.get(i);
        }
        long endTime = System.currentTimeMillis();
        long valueTime = endTime - startTime;
        System.out.println(getListName(list)+"读取"+COUNT+"条记录用时："+valueTime+"ms");
    }

    //删除，从第一个开始删除元素
    public static void deleteByPosition(List list){
        long startTime = System.currentTimeMillis();
        for(int i = 0;i<list.size();i++){
            list.remove(0);
        }
        long endTime = System.currentTimeMillis();
        long valueTime = endTime - startTime;
        System.out.println(getListName(list)+"删除"+COUNT+"条记录用时："+valueTime+"ms");
    }

}
