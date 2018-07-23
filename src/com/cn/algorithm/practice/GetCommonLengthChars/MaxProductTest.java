package com.cn.algorithm.practice.GetCommonLengthChars;

public class MaxProductTest {

  public static void main(String[] args){
    double[] ns = new double[]{2,1,0,-1,-3,2,4};

    System.out.println(getProduct(ns));
  }

  private static double getProduct(double[] ns){

    if(ns.length==0)
      return 0;

    double max = ns[0];
    double min = ns[0];
    double res = ns[0];
    double maxEnd = 0;
    double minEnd = 0;

    int i = 1;
    while(i!=ns.length){
      maxEnd = max * ns[i];
      minEnd = min * ns[i];
      max = Math.max(Math.max(minEnd,maxEnd),ns[i]);
      min = Math.min(Math.min(minEnd,maxEnd),ns[i]);
      res = Math.max(max,res);
      i++;
    }
    return res;
  }

}
