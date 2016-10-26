package com.java.collection;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by duanxiangchao on 2015/8/4.
 */
public class MyHashMap<K, V> extends AbstractMap<K, V> implements Map<K, V>, Cloneable, Serializable{

    //系统默认初始容量，必须是2的N次幂
    static final int DEFAULT_INITIAL_CAPACITY = 16;
    //系统默认最大容量   int的最大值
    static final int MAXIMUM_CAPACITY = 1 << 30;
    //系统默认的负载因子，可在构造函数中指定
    static final float DEFAULT_LOAD_FACTOR = 0.75f;
    //用于存储的表，长度可以调整，必须是2的N次幂
    transient Entry[] table;
    //当前map的key-value映射数，也就是当前size
    transient int size;
    //阈值
    int threshold;
    //哈希表的负载因子
    final float loadFactor;
    //用于确保使用迭代器的时候，hashMap并未进行修改
    transient volatile int modCount;
    //hash种子
    transient int hashSeed = 0;

    //默认构造函数
    public MyHashMap(){
        loadFactor = DEFAULT_LOAD_FACTOR;
        threshold = (int)(DEFAULT_INITIAL_CAPACITY * DEFAULT_LOAD_FACTOR);
        table = new Entry[DEFAULT_INITIAL_CAPACITY];
        init();
    }

    //构造带初始容量和默认加载因子（0.75）的空HashMap
    public MyHashMap(int initialCapacity) {
        this(initialCapacity, DEFAULT_LOAD_FACTOR);
    }

    public MyHashMap(int initialCapacity, float loadFactor){
        //指定初始容量小于0，抛出异常
        if(initialCapacity < 0){
            throw new IllegalArgumentException("Illegal initalCapacity:" + initialCapacity);
        }
        //初始容量大于系统默认最大值，则初始容量为最大容量
        if(initialCapacity > MAXIMUM_CAPACITY){
            initialCapacity = MAXIMUM_CAPACITY;
        }
        //如果loadFactory小于0，或者loadFactory是个NaN,抛出异常
        if(loadFactor <= 0 || Float.isNaN(loadFactor)){
            throw new IllegalArgumentException("Illegal load factory:" + loadFactor);
        }
        //寻找一个2的k次幂恰好大于initalCapacity
        int capacity = 1;
        while(capacity < initialCapacity){
            capacity <<= 2;
        }

        //设置加载因子
        this.loadFactor = loadFactor;
        //设置阈值为capacity*loadFactory，当hashMap的size到达这个阈值时，HashMap就需要扩大一倍了
        threshold = (int)(capacity * loadFactor);

        table = new Entry[capacity];
        init();
    }

    //定义一个空方法用于未来的子对象扩展，该方法用于初始化之后，插入元素之前
    void init(){

    }


    public MyHashMap(Map<? extends K,? extends V> m){
        this(Math.max((int)(m.size() / DEFAULT_LOAD_FACTOR)+1, DEFAULT_INITIAL_CAPACITY), DEFAULT_LOAD_FACTOR);

    }

    public void putAllForCreate(Map<? extends  K, ? extends V> m){
        for(Map.Entry<? extends K, ? extends V> e: m.entrySet()){

        }
    }

    public V put(K key, V value){
        if(key == null){

        }
        return null;

    }

    //key==null 赋值
    private V putForNullKey(V value){
        for(Entry<K, V> e = table[0]; e !=null; e = e.next){
            if(e.key == null){
                V oldValue = e.value;
                e.value = value;
                e.recordAccess(this);
                return oldValue;
            }
        }
        modCount++ ;
        return value;
    }

    void addEntry(int hash, K key, V value, int bucketIndex){
        if(size >= threshold && null != table[bucketIndex]){


        }
    }

    void resize(int newCapacity){
        Entry[] oldTable = table;
        int oldCapacity = oldTable.length;
        if(oldCapacity == MAXIMUM_CAPACITY){
            threshold = Integer.MAX_VALUE;
            return ;
        }
        Entry[] newTable = new Entry[newCapacity];

    }

    //转移数组到 newTable
    void transfer(Entry[] newTable, boolean rehash){
        int newCapacity = newTable.length;
        for(Entry<K, V> e: table){
            while (null != e){
                Entry<K, V> next = e.next;
                if(rehash){
                 //   e.hash = null == e.key? 0 : hash(e.key);
                }
                int i = indexFor(e.hash, newCapacity);
                e.next = table[i];
                newTable[i] = e;
                e = next;
            }
        }
    }

    public void putForCreate(K key, V value){
        int hash = null == key ? 0 : hash(key);
        int i = indexFor(hash, table.length);
        for(Entry<K, V> e = table[i];e != null; e = e.next){
            Object k;

        }
    }

    final int hash(Object k){
        int h = hashSeed;
        if(0 != h && k instanceof String){
//            return sun.misc.Hashing.stringHash32((String) k);
        }
        h ^= k.hashCode();
        h ^= (h >>> 20) ^ (h >>> 12);
        return h ^ (h >>> 7) ^ (h >>> 4);
    }

    static int indexFor(int h, int length){
        return h & (length - 1);
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        return null;
    }

    static class Entry<K, V> implements Map.Entry<K, V>{
        final K key;
        V value;
        Entry<K, V> next;
        final int hash;

        Entry(int h, K k, V v, Entry<K, V> n){
            key = k;
            value = v;
            next = n;
            hash = h;    //哈希值
//            key = k;
        }

        public final K getKey(){
            return key;
        }

        public final V getValue(){
            return value;
        }

        public final V setValue(V newValue){
            V oldValue = value;
            value = newValue;
            return oldValue;
        }

        //判断两个Entry是否相等，若两个Entry的“key”和“value”都相等，则返回true，否则返回false
        public final boolean equals(Object o){
            if(!(o instanceof Map.Entry))
                return false;
            Map.Entry e = (Map.Entry) o;
            Object k1 = getKey();
            Object k2 = e.getKey();
            if(k1 == k2 || (k1 != null && k1.equals(k2))){
                Object v1 = getValue();
                Object v2 = e.getValue();
                if(v1 == v2 || (v1 != null && v1.equals(v2)))
                    return true;
            }
            return false;
        }

        //实现hashCode
        public final int hashCode(){
            return (key == null? 0: key.hashCode()) ^ (value == null? 0: value.hashCode());
        }

        public final String toString(){
            return getKey() + "=" + getValue();
        }

        //添加元素是调用
        void recordAccess(MyHashMap<K, V> m){
        }

        //删除元素时调用
        void recordRemoval(MyHashMap<K, V> m){
        }

    }

}
