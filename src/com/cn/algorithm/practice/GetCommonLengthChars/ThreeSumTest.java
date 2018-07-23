package com.cn.algorithm.practice.GetCommonLengthChars;

import java.util.ArrayList;
import java.util.List;

public class ThreeSumTest {

  public static void main(String[] args) {


  }

  private static List<List<Integer>> threeSum(int[] ns, int targert) {

    List<List<Integer>> res = new ArrayList<>();

    List<Integer> temp = new ArrayList<>();

    getTarget(ns,res,temp,targert,0);

    return res;

  }

  private static void getTarget(int[] ns,List<List<Integer>> res,List<Integer> temp,int target,int index){

    if(target==0)
      res.add(temp);
    else{

    }
  }

}
