package com.cn.algorithm.practice.GetCommonLengthChars;

public class MergeTwoSortedArrayTest {

  public static void main(String[] args) {

    int[] ns1 = new int[]{1, 2, 3, 0, 0, 0};
    int[] ns2 = new int[]{2, 5, 6};

    mergerArray(ns1, 3, ns2, 3);

    for (int i : ns1) {
      System.out.println(i);
    }

  }

  /**
   * 从前往后遍历，对比交换每次都需要将数组往后移动，时间复杂度较高
   * @param ns1
   * @param m
   * @param ns2
   * @param n
   */
  private static void merger(int[] ns1, int m, int[] ns2, int n) {

    if (ns2 == null)
      return;

    int i = 0;
    int j = 0;

    while (i < m && j < n) {
      if (ns1[i] >= ns2[j]) {
        removeToBack(ns1, i, m++);
        ns1[i] = ns2[j++];
      } else {
        i++;
      }
    }

    while (j < n) {
      ns1[m++] = ns2[j++];
    }

  }

  private static void removeToBack(int[] ns1, int index, int m) {
    while (index < m) {
      ns1[m] = ns1[--m];
    }
  }

  /**
   * 从后往前添加，时间复杂度为O(N)
   * @param ns1
   * @param m
   * @param ns2
   * @param n
   */
  private static void mergerArray(int[] ns1, int m, int[] ns2, int n) {

    if (ns2 == null)
      return;

    int len = m + n - 1;
    m -= 1;
    n -= 1;

    while (m >= 0 && n >= 0) {
      if (ns1[m] > ns2[n])
        ns1[len--] = ns1[m--];
      else
        ns1[len--] = ns2[n--];
    }

    while (m >= 0)
      ns1[len--] = ns1[m--];
    while (n >= 0)
      ns1[len--] = ns2[n--];

  }


}
