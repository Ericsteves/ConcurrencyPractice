package com.cn.algorithm.practice.GetCommonLengthChars;

public class getAverage {

  public static void main(String[] args) {

    int a = Integer.MAX_VALUE, b = Integer.MIN_VALUE;

    System.out.println(average(a, b));
    System.out.println(averages(a, b));

    System.out.println(-1/2);

    System.out.println(plus(a, b));

  }

  private static int average(int x, int y) {
    return x + (y - x) / 2;
  }

  private static int averages(int x, int y) {
    return (x & y) + ((x ^ y) / 2);
  }

  private static int plus(int a, int b) {
    return (a | b) + (a & b);
  }

}
