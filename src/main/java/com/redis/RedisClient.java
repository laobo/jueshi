package com.redis;

import redis.clients.jedis.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by duanxiangchao on 2015/12/22.
 */
public class RedisClient {


    private Jedis jedis;
    private JedisPool jedisPool;

    private ShardedJedis shardedJedis;
    private ShardedJedisPool shardedJedisPool;

    public RedisClient(){
        initalPool();
        initalShardedPool();
        jedis = jedisPool.getResource();
        shardedJedis = shardedJedisPool.getResource();
    }

    private void initalPool(){
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxIdle(5);
        config.setMaxWaitMillis(10001);
        config.setTestOnBorrow(false);
        config.setJmxNamePrefix("laobo");
        jedisPool = new JedisPool(config, "127.0.0.1", 6379);
    }

    private void initalShardedPool(){
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxIdle(5);
        config.setMaxWaitMillis(10001);
        config.setTestOnBorrow(false);
        config.setTestOnBorrow(false);
        List<JedisShardInfo> shards = new ArrayList<JedisShardInfo>();
        shards.add(new JedisShardInfo("127.0.0.1", 6379, "master"));
        shardedJedisPool = new ShardedJedisPool(config, shards);
    }

    public Jedis getJedis(){
        return jedis;
    }

    public ShardedJedis getShardedJedis(){
        return shardedJedis;
    }

}
