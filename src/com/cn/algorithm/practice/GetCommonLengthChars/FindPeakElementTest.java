package com.cn.algorithm.practice.GetCommonLengthChars;

public class FindPeakElementTest {

  public static void main(String[] args) {

    int[] ns = new int[]{1, 2, 1, 3, 5, 6, 4};
    System.out.println(findPeakElement(ns));
  }

  private static int findPeakElement(int[] ns) {

    if (ns == null || ns.length == 0)
      return -1;
    if (ns.length == 1 || ns[0] > ns[1])
      return 0;

    int i = 1;
    int n = ns.length;


    while (i < n - 1) {
      if (ns[i] > ns[i - 1] && ns[i] > ns[i + 1])
        return i;
      i++;
    }

    return n-1;
  }

}
