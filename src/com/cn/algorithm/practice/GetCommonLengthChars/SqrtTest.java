package com.cn.algorithm.practice.GetCommonLengthChars;

public class SqrtTest {

  public static void main(String[] args) {
//    System.out.println(sqrt(2147483647));
//    System.out.println(Math.sqrt(2147483647));

    System.out.println(sqrt(4));

    System.out.println(sqrt(16));

    System.out.println(1073741823 * 1073741823);

//    System.out.println(289398 * 289398);
    System.out.println(46340 * 46340);
//    System.out.println((Math.abs(46341 * 46341)) > 2147395600);


    System.out.println(1 >> 1);

  }

  public static int sqrt(int n) {
    int end = 46340 > n >> 1 ? n >> 1 : 46340; // 46340*46340<Integer.MAX_VALUE and 46341*46341<Integer.MAX_VALUE
    int start = 0;

    if (n == 0)
      return 0;
    if (n == 1)
      return 1;

    if (end * end <= n) {
      return end;
    }

    while (start < end) {
      int pos = (start + end) >> 1;
      if (pos * pos <= n) {
        if ((pos + 1) * (pos + 1) > n)
          return pos;
        start = pos;
      } else
        end = pos;
    }

    return start * start <= n ? start : --start;
  }


  public static double getMedian(int a, int b) {
    return a + (a - b) / 2;
  }

}
