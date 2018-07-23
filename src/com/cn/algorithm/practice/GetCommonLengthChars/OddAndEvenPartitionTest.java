package com.cn.algorithm.practice.GetCommonLengthChars;

public class OddAndEvenPartitionTest {

  public static void main(String[] args) {
    int[] ns = new int[]{10, 2, 5, 3, 7, 4, 8, 9, 1};
    process(ns, 0, ns.length - 1);
    for (int i : ns) {
      System.out.println(i);
    }
  }

  private static void process(int[] ns, int start, int end) {
    while (end > start) {
      while (end > start && (ns[end] & 1) == 0)
        end--;
      if ((ns[end] & 1) != 0)
        swap(ns, start, end);

      while (end > start && (ns[start] & 1) == 1)
        start++;
      if ((ns[start] & 1) != 1)
        swap(ns, start, end);

    }
  }

  private static void swap(int[] arr, int x, int y) {

    int temp = arr[x];
    arr[x] = arr[y];
    arr[y] = temp;

  }

}
