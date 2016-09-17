package com.dxc.mongodb;

import com.mongodb.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by duanxiangchao on 2015/7/21.
 */
public class MongoDBCRUD {

    private Mongo mongo = null;
    private DB db;
    private DBCollection customer;

    @Before
    public void init(){
        mongo = new Mongo("localhost",27017);
        db = mongo.getDB("test");
        customer = db.getCollection("customer");
    }

    @After
    public void destory(){
        if(mongo != null){
            mongo.close();
        }
        mongo = null;
        db = null;
        customer = null;
        System.gc();
    }

    private void queryAll(){
        System.out.println("查询customer的所有数据");
        DBCursor cur = customer.find();
        while (cur.hasNext()){
            System.out.println(cur.next());
        }
    }

    @Test
    public void add(){
        queryAll();
        System.out.println("count:" + customer.count());

        DBObject obj = new BasicDBObject();
        obj.put("name","张三");
        obj.put("sex","男");
        obj.put("age",30);
        //保存数据
        int row = customer.save(obj).getN();
        System.out.println("受影响的行数："+row);

    }

}
