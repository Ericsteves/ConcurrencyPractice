package com.cn.algorithm.practice.GetCommonLengthChars;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache1 {

  private LinkedHashMap<Integer,Integer> map;

  private final int capacity;

  LRUCache1(int capacity){
    this.capacity = capacity;
    map = new LinkedHashMap<Integer, Integer>(capacity,0.75f,true){
      protected boolean removeEldestEntry(Map.Entry eldest){
        return size() > capacity;
      }
    };
  }


  public int get(int key){
    return map.getOrDefault(key,-1);
  }

  public void set(int key,int value){
    map.put(key,value);
  }

  public String toString(){
    StringBuffer sb = new StringBuffer();

    for(Map.Entry entry : map.entrySet()){
      sb.append(entry.getKey()).append(":").append(entry.getValue()).append("-->");
    }
    sb.append("length:"+map.size());
    sb.append("capacity:"+this.capacity);
    return sb.toString();
  }

}
