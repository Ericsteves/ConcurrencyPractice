package com.cn.algorithm.practice.GetCommonLengthChars;

public class FibonacciTest {

  public static void main(String[] args) {
    System.out.println(fibonacci2(5));
  }

  public static int fibonacci(int n) {
    if (n <= 0)
      return 0;
    if (n == 1 || n == 2)
      return 1;
    return fibonacci(n - 1) + fibonacci(n - 2);
  }

  public static int fibonacci2(int n) {
    if (n <= 0)
      return 0;
    if (n == 1 || n == 2)
      return 1;

    int res = 1;
    int pre = 1;
    int temp;

    for (int i = 3; i <= n; i++) {
      temp = res;
      res = temp + pre;
      pre = temp;
    }
    return res;
  }


}
