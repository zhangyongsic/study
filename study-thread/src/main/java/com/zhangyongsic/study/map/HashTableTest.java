package com.zhangyongsic.study.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @program: study
 * @description:
 * @author: zhang yong
 * @create: 2020/02/27
 */
public class HashTableTest {
    public static void main(String[] args) {
        Hashtable<String,String> hashtable = new Hashtable<String, String>();
        hashtable.put(null,"zy");
        System.out.println(hashtable);
        ConcurrentHashMap<String,String> concurrentHashMap = new ConcurrentHashMap<String, String>();
        concurrentHashMap.put("s","s");
    }
}
