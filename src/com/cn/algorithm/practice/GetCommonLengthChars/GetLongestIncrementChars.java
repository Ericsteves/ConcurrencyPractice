package com.cn.algorithm.practice.GetCommonLengthChars;

public class GetLongestIncrementChars {

  public static void main(String[] args) {

    int[] arr = new int[]{2, 1, 5, 3, 6, 4, 8, 9, 7};

    int[] dp = getDp(arr);

    int[] r = adjustment(arr, dp);

    for (int n : r) {
      System.out.println(n);
    }

  }

  public static int[] getDp(int[] arr) {

    int[] dp = new int[arr.length];

    for (int i = 0; i < arr.length; i++) {
      dp[i] = 1;
      for (int j = 0; j < i; j++) {
        if (arr[i] > arr[j]) {
          dp[i] = Math.max(dp[i], dp[j] + 1);
        }
      }
    }

    return dp;
  }

  public static int[] adjustment(int[] arr, int[] dp) {

    int index = 0;
    int length = dp[0];

    for (int i = 1; i < dp.length; i++) {
      if (dp[i] > dp[i - 1]) {
        length = dp[i];
        index = i;
      }
    }

    int[] r = new int[length];
    length--;
    r[length--] = arr[index];
    for (int i = index; i >= 1; i--) {
      if (arr[i] > arr[i - 1] && dp[i] == dp[i - 1] + 1) {
        r[length--] = arr[i-1];
      }
    }
    return r;
  }

}
