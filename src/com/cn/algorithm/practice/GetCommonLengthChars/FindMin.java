package com.cn.algorithm.practice.GetCommonLengthChars;

public class FindMin {

  public static void main(String[] args) {

    int[] arr = new int[]{4, 5, 6, 1, 2, 3}; //[1,2,3,4,5,6] -> [4,5,6,1,2,3] 不重复的排序数组通过某一轴旋转得到
    int[] arr1 = new int[]{2,2,2,0,1};
    int[] ns = new int[]{3, 1, 3, 3, 3};

    System.out.println(findMins(arr1));
    System.out.println(findMin(arr));
    System.out.println(findMinDuplicates(ns));

    System.out.println(process(ns));

  }

  public static int findMin(int[] nums) {

    if (nums.length == 0)
      return 0;
    if (nums.length == 1)
      return nums[0];

    if (nums[0] < nums[nums.length - 1])
      return nums[0];

    int start = 0, end = nums.length - 1;

    while (start < end) {
      int i = (start + end) >> 1;
      if (i < nums.length - 1 && nums[i] > nums[i + 1])
        return nums[i + 1];

      if (nums[i] > nums[0])
        start = i;
      else
        end = i;
    }
    return nums[start];

  }

  public static int findMins(int[] nums) {

    int start = 0, end = nums.length - 1, min = nums[0];

    while (start < end-1) {
      int mid = (start + end) >> 1;

      if (nums[mid] > nums[start]) {
        min = Math.min(min,nums[start]);
        start = mid + 1;
      }else if(nums[mid] < nums[start]){
        min = Math.min(min,nums[mid]);
        end = mid - 1;
      }else{
        start++;
      }
    }

    min = Math.min(min,nums[start]);
    min = Math.min(min,nums[end]);

    return min;

  }

  public static int findMinDuplicates(int[] nums) {

    if (nums.length == 0)
      return 0;
    if (nums.length == 1)
      return nums[0];

    if (nums[0] < nums[nums.length - 1])
      return nums[0];

    int start = 0, end = nums.length - 1;

    while (start < end) {
      int i = (start == end - 1) ? start : (start + end) >> 1;
      if (i < nums.length - 1 && nums[i] > nums[i + 1])
        return nums[i + 1];

      if (nums[i] > nums[0])
        start = i;
      else
        end = i;
    }
    return nums[start];

  }

  public static int process(int[] nums) {

    if (nums.length == 0)
      return 0;
    if (nums.length == 1)
      return nums[0];

    if (nums[0] < nums[nums.length - 1])
      return nums[0];

    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] > nums[i + 1])
        return nums[i + 1];
      if (i == nums.length - 2)
        return nums[i];
    }
    return 0;

  }

}
