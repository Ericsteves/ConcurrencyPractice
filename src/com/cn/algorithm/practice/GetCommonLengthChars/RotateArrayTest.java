package com.cn.algorithm.practice.GetCommonLengthChars;

public class RotateArrayTest {

  public static void main(String[] args) {

    int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
    rotateArrays(arr, 3);

    for (int i : arr) {
      System.out.println(i);
    }

  }

  private static int[] rotateArray(int[] arr, int n) {

    if (arr == null || n == 0)
      return arr;

    int[] res = new int[arr.length];

    int size = arr.length;

    int offset = n % size;

    int i = 0;

    while (i < offset) {
      res[i] = arr[size - offset + (i++)];
    }

    i = 0;
    int index = offset;
    while (i < size - offset && index < size) {
      res[index++] = arr[i++];
    }

    return res;

  }


  private static void rotateArrays(int[] arr, int k) {

    if (arr == null || k == 0)
      return;
    k = k % arr.length;
    reverse(arr, 0, arr.length - 1);
    reverse(arr, 0, k - 1);
    reverse(arr, k, arr.length - 1);

  }

  private static void reverse(int[] arr, int i, int j) {

    while (i < j) {
      swap(arr, i++, j--);
    }

  }

  private static void swap(int[] arr, int x, int y) {

    int temp = arr[x];
    arr[x] = arr[y];
    arr[y] = temp;

  }


}
