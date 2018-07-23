package com.cn.algorithm.practice.GetCommonLengthChars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UnmodefiedListTest {

  public static void main(String[] args){

    List list = Arrays.asList("a","b","c");

//    list.add("d");

    List result = new ArrayList(list);

    result.add("d");
    System.out.println(result.toString());
    result = unmodifiedList(result);

    result.add("e");

  }

  public static List unmodifiedList(List list){
    return Collections.unmodifiableList(list);
  }

}
