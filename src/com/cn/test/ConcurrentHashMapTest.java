package com.cn.test;

import java.util.ArrayList;
import java.util.List;

public class ConcurrentHashMapTest {

  public static void main(String[] args) {

    int a = 0x7fffffff;
    System.out.println(Integer.toBinaryString(a));

    int s = 12;
    System.out.println(s << 1);

    int ss = 12;
    System.out.println(ss >> 1);

    int n = 16;
    System.out.println(n >>> 3);

    int hash = 21412121;
    System.out.println(Integer.toBinaryString(hash));
    System.out.println(Integer.toBinaryString(n-1));
    System.out.println(Integer.toBinaryString(hash & (n-1)));
    System.out.println(hash & (n-1));


    int[] ns = new int[]{11,11,2,3,4,4,4,5,6,6};

    int[] result = removeTheSame(ns);

    for(int i : result) {
      System.out.println(i);
    }

  }


  public static int[] removeTheSame(int[] ns){
    List<Integer> result = new ArrayList<>();

    for(int i=0;i<ns.length;i++){
      if(!result.contains(ns[i]))
        result.add(ns[i]);
    }

    return result.stream().mapToInt(i->i).toArray();
  }

}
