package _2016.com.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by duanxiangchao on 2016/8/10.
 */
public class MyTest {

    public static void main(String[] arg){

//        testFloat();

        testHashMap();

    }

    private static void testHashMap(){
        LinkedHashMap<String, String> hashMap1 = new LinkedHashMap<String, String>();
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("111", "aaa");
        hashMap.put("222", "bbb");
        hashMap.put("333", "ccc");
        hashMap.put("444", "ddd");
        hashMap.put("555", "eee");
        for(Map.Entry<String, String> entry: hashMap.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        System.out.println("=====迭代器显示======");
        Iterator<Map.Entry<String, String>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        System.out.println("=====只显示key======");
        for(String key: hashMap.keySet()){
            System.out.println(key);
        }

    }

    private static void testFloat() {
        float a = 3*(0.1f);
        a = 0.3f;
        System.out.println(a);
        System.out.println(a - 0.2);
    }

}
