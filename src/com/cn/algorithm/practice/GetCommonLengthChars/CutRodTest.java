package com.cn.algorithm.practice.GetCommonLengthChars;

public class CutRodTest {

  public static void main(String[] args) {

    int[] p = new int[]{1, 5, 8, 9, 10, 17, 17, 20, 24, 30};

    System.out.println(cut2(p, 10));

  }

  public static int cut(int[] p, int n) {

    if (n <= 0)
      return 0;
    int q = Integer.MIN_VALUE;
    for (int i = 1; i <= n; i++) {
      q = Math.max(q, p[i - 1] + cut(p, n - i));
    }
    return q;
  }

  public static int cut2(int[] p, int n) {
    if (n <= 0 || n > p.length)
      return 0;
    int[] r = new int[p.length + 1];


    for (int i = 1; i <= n; i++) {
      int q = -1;
      for (int j = 1; j <= i; j++) {
        q = Math.max(q, p[j - 1] + r[i - j]);
      }
      r[i] = q;
    }
    return r[n];
  }

}
