package com.cn.algorithm.practice.GetCommonLengthChars;

import java.util.ArrayList;
import java.util.List;

public class SubSetsTest {

  public static void main(String[] args) {

    int[] nums = new int[]{1, 2, 3};
    List<List<Integer>> result = subSets(nums);

    System.out.println(result.toString());

  }

  public static List<List<Integer>> subSets(int[] nums) {

    List<List<Integer>> result = new ArrayList<>();
    int total = 1 << nums.length;
    int j, mask;
    for (int i = 0; i < total; i++) {
      j = 0;
      mask = i;
      List<Integer> subList = new ArrayList<>();
      while (mask > 0) {
        if ((mask & 1) > 0)
          subList.add(nums[j]);
        mask >>= 1;
        j++;
      }
      result.add(subList);
    }
    return result;

  }


}
