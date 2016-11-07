package com.mongodb;

import com.mongodb.util.JSON;

/**
 * Created by duanxiangchao on 2015/7/21.
 */
public class SimpleTest {

    public static void main(String [] str){

        //新建连接，默认连接本地的27017端口
        Mongo mongo = new Mongo();
        //查询所有的database
        for(String name:mongo.getDatabaseNames()){
            System.out.println("dbName:"+name);
        }

        DB db = mongo.getDB("test");
        //查询所有的collection
        for(String name:db.getCollectionNames()){
            System.out.println("collectionName:"+name);
        }

        DBCollection customer = db.getCollection("customer");
        DBCursor cur = customer.find();
        while (cur.hasNext()){
            System.out.println(cur.next());
        }

        System.out.println(cur.count());
        System.out.println(cur.getCursorId());
        System.out.println(JSON.serialize(cur));

    }

}
