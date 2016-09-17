package com.dxc.thinkingInJava.caozuofu;


import java.util.Random;

/**
 * Created by duanxiangchao on 2015/7/9.
 */
public class Test {

    public static void main(String[] arg){
        //system类  属性out  类型为PrintStream  方法为println();
        System.out.println("Hello,world!");

        //操作符测试
        //testCaozuofu();

        //测试随机数
        testRandom();

        //测试 ++  -- 运算符
        testDizeng();

    }

    public static void yinyong(){
        //对象赋值只是多了一个对对象的引用
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 9;
        t2.level = 47;
        System.out.println("1:t1.level:"+t1.level+",t2.level:"+t2.level);
        t1 = t2;
        System.out.println("1:t1.level:"+t1.level+",t2.level:"+t2.level);
        t1.level = 27;
        System.out.println("1:t1.level:" + t1.level + ",t2.level:" + t2.level);
    }

    public static void testRandom(){
        Random random = new Random();
        for(int i = 1;i <= 10;i++){
            System.out.println(random.nextInt(99)+1);
        }
    }

    public static void testCaozuofu(){
        //娒有什么偄用
        Random random = new Random(45);
        int i,j,k;
        j = random.nextInt(100) + 1;
        System.out.println(" j: " + j);
        k = random.nextInt(100) + 1;
        System.out.println(" k: " + k);
        i = j + k;
        System.out.println(" j + K: " + i);
        i = j - k;
        System.out.println(" j - K: " + i);
        i = k / j;
        System.out.println(" k / j: " + i);
        i = k * j;
        System.out.println(" k * j: " + i);
        i = k % j;
        System.out.println(" k % j: " + i);
        j %= k;
        System.out.println(" j %= k " + j);

        //test  Float
        float u,v,w;
        u = random.nextFloat();
        System.out.println(" u: " + u);
        v = random.nextFloat();
        System.out.println(" v: " + v);
        w = u + v;
        System.out.println(" u - v: " + w);
        w = u - v;
        System.out.println(" u - v: " + w);
        w = u * v;
        System.out.println(" u * v: " + w);
        w = u / v;
        System.out.println(" u / v: " + w);
        //
        u += v;
        System.out.println(" u += v:" + u);
        u -= v;
        System.out.println(" u -= v: " + u);
        u *= v;
        System.out.println(" u *= v: " + u);
        u /= v;
        System.out.println(" u /= v: " + u);
    }

    public static void testDizeng(){
        int i = 1;
        System.out.println(" i: "+i);       //结果  1
        System.out.println(" ++i: "+ ++i);  //结果  2
        System.out.println(" i++: "+ i++);  //结果  2
        System.out.println(" i: "+i);       //结果  3
        System.out.println(" --i: "+ --i);  //结果  2
        System.out.println(" i--: "+ i--);  //结果  2
        System.out.println(" i: "+ i);      //结果  1
    }

}

class Tank{
    int level;
}
