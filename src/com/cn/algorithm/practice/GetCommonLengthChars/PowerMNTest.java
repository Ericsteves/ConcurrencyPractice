package com.cn.algorithm.practice.GetCommonLengthChars;

public class PowerMNTest {

  public static void main(String[] args) {

    System.out.println(Integer.toBinaryString(Integer.MIN_VALUE));
    System.out.println(-1 * -2147483647);
    System.out.println(-1 * -2147483648);
    System.out.println(power(-1, -2147483647));
    System.out.println(myPow(-1, -2147483648));
    System.out.println(Math.pow(1, -2147483648));
    System.out.println(Math.pow(-1, -2147483648));
    System.out.println(Math.pow(-1, -3));
    System.out.println(Math.pow(-1, -4));

    System.out.println("-=-="+Math.round(-3 >> 1));
    System.out.println("-=-="+Math.ceil(-3 >> 1));
    System.out.println("-=-="+Math.floor(-3 >> 1));
    System.out.println("-=-="+Math.round(-3 / 2));
    System.out.println("-=-="+Math.ceil(-3 / 2));
    System.out.println("-=-="+Math.floor(-3 / 2));
    System.out.println(-3 / 2);
    System.out.println(-3 % 2);
    System.out.println(-3 >>> 1);
    System.out.println(-3 >>> 1);

    System.out.println(Integer.MIN_VALUE < -2147483648);
    System.out.println(Integer.MIN_VALUE);
    System.out.println(Integer.MAX_VALUE);

  }

  /**
   * 假如知道 m^i (i=n/2)的结果，那么如果n为偶数，则m^n = (m^i)^2, 如果n为奇数，则m^n=m*(m^i)^2
   * 利用递归，时间复杂度为：O(logN)
   *
   * @param m
   * @param n
   * @return s
   */
  private static double power(double m, int n) {

    if (n == 0 || m == 1)
      return 1;
    else if (n == 1)
      return m;
    else if(m == -1)
      return (n & 1) == 0 ? 1 : -1;
    else if(n <= Integer.MIN_VALUE)
      return 0;

    double s = power(m, Math.abs(n) >> 1);
    double e = (n & 1) == 0 ? 1 : m;

    if (n > 0)
        s *= s * e;
    else
        s = 1.0 / (s * s * e);

    return s;
  }


  public static double myPow(double x, int n) {
    if (x == 0)
      return 0;

    int sign = (n < 0) ? -1 : 1;
    double result = calculatePow(x, n * sign);
    return (sign == -1) ? 1.0 / result : result;
  }

  public static double calculatePow(double x, int n) {
    if (n == 0) return 1.0;
    if (n == 1) return x;

    double result = calculatePow(x, n/2);

    if (n % 2 == 0)
      return result * result;

    return (result * result) * x;

  }

}
