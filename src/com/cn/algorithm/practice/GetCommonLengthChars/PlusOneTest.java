package com.cn.algorithm.practice.GetCommonLengthChars;

public class PlusOneTest {

  public static void main(String[] args) {

    int[] arr = new int[]{1, 2, 3};

    int[] result = plusOne(arr);

    assert result != null;
    for (int i : result) {
      System.out.println(i);
    }

  }

  private static int[] plusOne(int[] ns) {

    if (ns.length == 0)
      return null;

    int pos = ns.length - 1;
    int[] arr = new int[ns.length + 1];

    int mask = 0, value;

    while (pos >= 0) {
      mask = pos == ns.length - 1 ? (ns[pos] + 1) / 10 : ns[pos] / 10;
      value = pos == ns.length - 1 ? (ns[pos] + 1) % 10 : ns[pos] % 10;
      if (mask > 0 && pos >= 1) {
        ns[pos - 1] = ns[pos - 1] + mask;
      }
      ns[pos] = value;
      pos--;
    }

    if (mask > 0) {
      arr[0] = 1;
      arr[1] = 0;
      for (int i = 2; i < arr.length - 1; i++) {
        arr[i] = ns[i - 2];
      }
    }

    return mask > 0 ? arr : ns;

  }

}
