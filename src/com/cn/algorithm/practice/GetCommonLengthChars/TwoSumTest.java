package com.cn.algorithm.practice.GetCommonLengthChars;

import java.util.HashMap;
import java.util.Map;

public class TwoSumTest {

  public static void main(String[] args){

    int[] data = new int[]{2,7,11,15};
    int target = 18;
    int[] r = twoSum2(data,target);
    for(int n : r){
      System.out.println(n);
    }
  }

  public static int[] twoSum(int[] data,int target){
    int[] r = new int[2];

    for(int i=0;i<data.length;i++){
      int purpose = target - data[i];
      for(int j=i+1;j<data.length;j++){
        if(data[j]==purpose){
          r[0]=data[i];
          r[1]=data[j];
        }
      }
    }
    return r;
  }

  public static int[] twoSum2(int[] data,int target){
    Map<Integer,Integer> map = new HashMap<>();
    for(int i=0;i<data.length;i++){
      map.put(data[i],i);
    }

    for(int i=0;i<data.length;i++){
      int purpose = target - data[i];
      if(map.containsKey(purpose) && map.get(purpose)!=i){
        return new int[]{data[i],map.get(purpose)};
      }
    }
    throw new IllegalArgumentException("No two sum solution");
  }

}
