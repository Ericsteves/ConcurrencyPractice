package com.cn.algorithm.practice.GetCommonLengthChars;

public class Testsss {

  private static int i = 0;
  private static int j = 0;

  public static void main(String[] rags) {
//    System.out.println(4 << 3);
//
//    int[] arr = new int[]{1, 2, 3, 4, 5, 6};
//
//    System.out.println(index(arr));
//
//    System.out.println(power(2, 1));

//    LRUCache2<Integer, Integer> cache = new LRUCache2<>(3);
//
//    LRUCache1 cache1 = new LRUCache1(3);
//
//    cache.set(1, 2);
//    cache.set(2, 3);
//    cache.set(3, 4);
//    cache.set(3, 5);
//    cache.set(5, 5);
//
//    System.out.println(cache.toString());
//
//    System.out.println(cache.get(5));


    String regex = "(a|b|c|cc)+\\s+d";


    String s = " d";

    System.out.println(s.matches(regex));

//    System.out.println(getNumOfFootball(899));
//    System.out.println(getNum(899));
//
//    System.out.println(i + " " + j);
//
//    int[] arr = new int[]{1, 2, 3, 4, 5, 6};
//
//    int x = 9;
//
//    makeChange(arr, x);
//
//    for (int i : arr) {
//      System.out.println(i);
//    }

  }


  private static void makeChange(int[] ns, int x) {

    int[] arrs = new int[]{4};
    ns = arrs;
    x *= x;
  }

  public static boolean check(int index) {
    return index >= 5;
  }

  public static int index(int[] arr) {
    if (arr.length == 0)
      return -1;

    int start = 0;
    int end = arr.length;
    if (check(start))
      return start;
    if (!check(end))
      return -1;

    while (start < end) {
      int i = (start + end) >> 1;
      if (check(i)) {
        if (i >= 1 && !check(i - 1))
          return i;
        end = i;
      } else {
        start = i;
      }
    }
    return -1;

  }

  public static int power(int m, int n) {
    int s;
    if (n == 0)
      return 1;
    else if (n == 1)
      return m;

    s = power(m, n >> 1);
    if ((n & 1) == 0)
      s = s * s;
    else
      s = s * s * m;

    return s;
  }


  private static int getNumOfFootball(int n) {
    if (n <= 1)
      return 0;
    return getNumOfFootball(n - 1) + 1;
  }


  private static int getNum(int n) {
    if (n <= 1)
      return 0;

    int half = n >> 1;
    int mask = n & 1;

    return half + getNum(half) + mask;

  }

}
