package com.cn.algorithm;

public class MergerSort {

  public static void main(String[] args) {

    int[] arr = new int[]{6, 4, 1, 7, 8, 10, 4};
//    System.out.println("afafafa");
    sort(arr, 0, arr.length - 1);
//    sortMergeRecursion(arr);
    for (int n : arr) {
      System.out.println(n);
    }

  }

  private static void sort(int[] arr, int low, int high) {

    if (low == high)
      return;
    int mid = (low + high) / 2;
    sort(arr, low, mid);
    sort(arr, mid + 1, high);
    merger(arr, low, mid, high);

  }

  private static void merger(int[] arr, int low, int mid, int high) {
    int[] result = new int[high - low + 1];

    int k = 0;
    int i = low;
    int j = mid + 1;

    while (i <= mid && j <= high) {
      result[k++] = arr[i] < arr[j] ? arr[i++] : arr[j++];
    }

    while (i <= mid) {
      result[k++] = arr[i++];
    }

    while (j <= high) {
      result[k++] = arr[j++];
    }
//    for (int n : result) {
//      System.out.println(n);
//    }

    for (int ii = 0; ii < k; ii++) {
      arr[low + ii] = result[ii];
    }

  }


  // 归并排序，递归实现
  public static void sortMergeRecursion(int[] nums) {
    sortMergeRecursionHelper(nums, 0, nums.length - 1);
  }

  private static void sortMergeRecursionHelper(int[] nums, int left, int right) {
    if (left == right) return;  // 当待排序的序列长度为1时，递归开始回溯，进行merge
    int middle = (right + left) / 2;
    sortMergeRecursionHelper(nums, left, middle);
    sortMergeRecursionHelper(nums, middle + 1, right);
    mergeArr(nums, left, middle, right);
  }

  private static void mergeArr(int[] nums, int left, int middle, int right) {
    int[] tem = new int[right - left + 1];
    int i = left, j = middle + 1, k = 0;
    while (i <= middle && j <= right) {
      tem[k++] = nums[i] < nums[j] ? nums[i++] : nums[j++];
    }
    while (i <= middle) {
      tem[k++] = nums[i++];
    }
    while (j <= right) {
      tem[k++] = nums[j++];
    }
    // 将辅助数组数据写入原数组
    int index = 0;
//    while (left <= right) {
//      nums[left++] = tem[index++];
//    }

    for (int ii = 0; ii < k; ii++) {
      nums[left + ii] = tem[ii];
    }
  }

}
