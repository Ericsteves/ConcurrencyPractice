package com.cn.algorithm.practice.GetCommonLengthChars;

public class SearchRotateArrayTest {

  public static void main(String[] args) {

    int[] nums = new int[]{4,5,6,7,0,1,2};

    System.out.println(search(nums,0));

  }

  public static int search(int[] nums, int target) {
    int start = 0, end = nums.length - 1, pos = -1;

    while (start <= end) {

      int mid = (start + end) >> 1;

      if (nums[mid] == target)
        return mid;

      if(nums[mid]>nums[start]){
        if(nums[mid]>target && nums[start]<=target)
          end = mid - 1;
        else
          start = mid + 1;

      }else if(nums[mid]<nums[start]){
        if(nums[mid]<target && nums[end]>=target)
          start = mid + 1;
        else
          end = mid - 1;
      }else{
        start++;
      }


    }
    return pos;
  }


}
