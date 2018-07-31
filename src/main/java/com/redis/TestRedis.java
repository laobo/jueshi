package com.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.SortingParams;

import java.util.Set;

/**
 * Created by duanxiangchao on 2015/12/22.
 */
public class TestRedis {


    public static void main(String [] str){

//        keyOperate();
        stringOperate();
//        listOperate();
//        setOperate();
    }

    //key功能
    private static void keyOperate(){
        RedisClient client = new RedisClient();
        Jedis jedis = client.getJedis();
        ShardedJedis shardedJedis = client.getShardedJedis();

        //keyOperate
        System.out.println("======================key==========================");
        System.out.println("清空库中所有数据：" + jedis.flushDB());
        System.out.println("判断key999键是否存在：" + shardedJedis.exists("key9999"));
        System.out.println("新增key001,value001键值对：" + shardedJedis.set("key001", "001"));
        System.out.println("判断key001是否存在：" + shardedJedis.exists("key001"));
        System.out.println("新增key002,value002键值对：" + shardedJedis.set("key002", "002"));
        System.out.println("系统中所有的键如下：");
        Set<String> keys = jedis.keys("*");
        for(String key: keys){
            System.out.println(key);
        }
        System.out.println("系统中删除key002:" + shardedJedis.del("key002"));
        System.out.println("判断key002是否存在：" + shardedJedis.exists("key002"));
        System.out.println("设置 key001的过期时间为5秒:" + shardedJedis.expire("key001", 5));
        try{

            Thread.sleep(2000);
        }catch (InterruptedException e){

        }
        System.out.println("查看key001的剩余生存时间：" + shardedJedis.ttl("key001"));
        System.out.println("移除key001的生存时间：" + shardedJedis.persist("key001"));
        System.out.println("查看key001的剩余生存时间：" + shardedJedis.ttl("key001"));
        System.out.println("查看key所储存的值的类型：" + shardedJedis.type("key001"));
    }

    //String功能
    private static void stringOperate(){
        RedisClient client = new RedisClient();
        Jedis jedis = client.getJedis();
        ShardedJedis shardedJedis = client.getShardedJedis();

        System.out.println("======================String_1==========================");
        System.out.println("清空库中所有数据："+jedis.flushDB());

        System.out.println("=========================增=============================");
        jedis.set("key001", "value001");
        jedis.set("key002", "value002");
        jedis.set("key003", "value003");
        System.out.println("查看增加的三个键值：");
        System.out.println("key001：" + jedis.get("key001"));
        System.out.println("key002：" + jedis.get("key002"));
        System.out.println("key003：" + jedis.get("key003"));
        System.out.println();

        System.out.println("=========================删=============================");
        System.out.println("删除key003键值对：" + jedis.del("key003"));
        System.out.println("获取key003键对应的值：" + jedis.get("key003"));
        System.out.println();

        System.out.println("=========================改=============================");
        System.out.println("直接覆盖key001原来的数据：" + jedis.set("key001", "value001-update"));
        System.out.println("获取key001对应的新值："+jedis.get("key001"));
        System.out.println("直接覆盖key001原来的数据：" + jedis.append("key002", "appendString"));
        System.out.println("获取key002对应的新值："+jedis.get("key002"));
        System.out.println();

        System.out.println("==================增，删，查（多个）=====================");
        System.out.println("一次新增四个值：" + jedis.mset("key201", "value201", "key202", "value202", "key203", "value203", "key204", "value204"));
        System.out.println("一次性获取四个值：" + jedis.mget("key201", "key202", "key203", "key204"));
        System.out.println("一次性删除两个值：" + jedis.del(new String[]{"key201", "key202"}));
        System.out.println("一次性获取四个值：" + jedis.mget("key201", "key202", "key203", "key204"));
        System.out.println();

        System.out.println("======================String_2==========================");
        System.out.println("清空库中所有数据："+jedis.flushDB());
        System.out.println("=============新增键值对时防止覆盖原先值=============");
        System.out.println("原先key301不存在时，新增key301：" + jedis.setnx("key301", "value301"));
        System.out.println("原先key301不存在时，新增key302：" + jedis.setnx("key302", "value302"));
        System.out.println("当key301存在时，尝试新增key301：" + jedis.setnx("key301", "value301_new"));
        System.out.println("当key302存在时，尝试新增key302：" + jedis.setnx("key302", "value302_new"));
        System.out.println("获取key301对应的值：" + jedis.get("key301"));
        System.out.println("获取key302对应的值：" + jedis.get("key302"));
        System.out.println();

        System.out.println("=============超过有效期键值对被删除=============");
        System.out.println("新增key303，并指定过期时间为2秒：" + jedis.setex("key303", 2, "value303"));
        System.out.println("获取key303对应的值：" + jedis.get("key303"));
        try{
            Thread.sleep(3000);
        }
        catch (InterruptedException e){
        }
        System.out.println("3秒之后，获取key303对应的值："+jedis.get("key303"));
        System.out.println();

        System.out.println("=============获取原值，更新为新值一步完成=============");
        System.out.println("key302原值："+shardedJedis.getSet("key302", "value302-after-getset"));
        System.out.println("key302新值："+shardedJedis.get("key302"));
        System.out.println();

        System.out.println("=============获取子串=============");
        System.out.println("获取key302对应值中的子串："+shardedJedis.getrange("key302", 5, 7));

    }

    private static void listOperate(){
        RedisClient client = new RedisClient();
        Jedis jedis = client.getJedis();
        ShardedJedis shardedJedis = client.getShardedJedis();
        System.out.println("======================list==========================");
        System.out.println("清空库中所有数据："+jedis.flushDB());

        System.out.println("=============增=============");
        jedis.lpush("stringList", "vector");
        jedis.lpush("stringList", "ArrayList");
        jedis.lpush("stringList", "vector");
        jedis.lpush("stringList", "vector");
        jedis.lpush("stringList", "LinkedList");
        jedis.lpush("stringList", "MapList");
        jedis.lpush("stringlist", "SerialList");
        jedis.lpush("stringlist", "HashList");
        jedis.lpush("numberList", "3");
        jedis.lpush("numberList", "1");
        jedis.lpush("numberList", "5");
        jedis.lpush("numberList", "2");
        System.out.println("所有元素stringList:" + jedis.lrange("stringList", 0, -1));
        System.out.println("所有元素numberList:" + jedis.lrange("numberList", 0, -1));
        System.out.println();

        System.out.println("=============删=============");
        // 删除列表指定的值 ，第二个参数为删除的个数（有重复时），先add进去的先删除
        System.out.println("成功删除指定元素个数：" + jedis.lrem("stringList", 2, "vector"));
        System.out.println("删除元素之后：" + jedis.lrange("stringList", 0, -1));
        System.out.println("删除下标0-3区间之外的元素：" + jedis.ltrim("stringList", 0, 3));
        System.out.println("删除指定区间元素后：" + jedis.lrange("stringList", 0, -1));
        System.out.println("出栈元素：" + jedis.lpop("stringList"));
        System.out.println("元素出栈后：" + jedis.lrange("stringList", 0, -1));
        System.out.println();

        System.out.println("=============改=============");
        jedis.lset("stringList", 0,  "hello list");
        System.out.println("下标为0的值修改后-stringlists：" + jedis.lrange("stringList", 0, -1));

        System.out.println("=============查=============");
        System.out.println("stringList长度：" + jedis.llen("stringList"));
        System.out.println("numberList长度：" + jedis.llen("numberList"));

        /*
         * list中存字符串时必须指定参数为alpha，如果不使用SortingParams，而是直接使用sort("list")，
         * 会出现"ERR One or more scores can't be converted into double"
         */
        SortingParams sortingParams =  new SortingParams();
        sortingParams.alpha();
        System.out.println("排序后的结果-stringList:" + jedis.sort("stringList", sortingParams));
        System.out.println("排序后的结果-numberList:" + jedis.sort("numberList", sortingParams));
        System.out.println("子串第二个到倒数第二一个-stringList:" + jedis.lrange("stringList", 1, -1));
        System.out.println("获取下标为2的元素：" + jedis.lindex("stringList", 2));
    }

    private static void setOperate(){
        RedisClient client = new RedisClient();
        Jedis jedis = client.getJedis();
        ShardedJedis shardedJedis = client.getShardedJedis();
        System.out.println("======================set==========================");
        System.out.println("清空库中所有数据："+jedis.flushDB());
        System.out.println();

        System.out.println("=============增=============");
        System.out.println("向sets集合加入元素element001:" + jedis.sadd("sets", "element001"));
        System.out.println("向sets集合加入元素element002:" + jedis.sadd("sets", "element002"));
        System.out.println("向sets集合加入元素element003:" + jedis.sadd("sets", "element003"));
        System.out.println("向sets集合加入元素element004:" + jedis.sadd("sets", "element004"));
        System.out.println("查看集合的所有元素：" + jedis.smembers("sets"));
        System.out.println();

        System.out.println("=============删=============");
        System.out.println("集合sets中删除元素element003：" + jedis.srem("sets", "element003"));
        System.out.println("查看集合的所有元素：" + jedis.smembers("sets"));

        System.out.println("是否存在element002元素：" + jedis.sismember("sets", "element002"));
        Set<String> set = jedis.smembers("sets");
        for(String str: set){
            System.out.println(str);
        }
        System.out.println();

        System.out.println("=============集合运算=============");
        System.out.println("sets1中添加元素element001："+jedis.sadd("sets1", "element001"));
        System.out.println("sets1中添加元素element002："+jedis.sadd("sets1", "element002"));
        System.out.println("sets1中添加元素element003："+jedis.sadd("sets1", "element003"));
        System.out.println("sets2中添加元素element002："+jedis.sadd("sets2", "element002"));
        System.out.println("sets2中添加元素element003："+jedis.sadd("sets2", "element003"));
        System.out.println("sets2中添加元素element004："+jedis.sadd("sets2", "element004"));
        System.out.println("查看sets1集合中的所有元素:"+jedis.smembers("sets1"));
        System.out.println("查看sets2集合中的所有元素:"+jedis.smembers("sets2"));
        System.out.println("sets1和sets2交集：" + jedis.sinter("sets1", "sets2"));
        System.out.println("sets1和sets2并集：" + jedis.sunion("sets1", "sets2"));
        System.out.println("sets1和sets2差集："+jedis.sdiff("sets1", "sets2"));

    }

}
