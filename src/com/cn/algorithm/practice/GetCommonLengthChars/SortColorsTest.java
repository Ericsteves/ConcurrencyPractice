package com.cn.algorithm.practice.GetCommonLengthChars;

public class SortColorsTest {

  public static void main(String[] args) {

    int[] ns = new int[]{0, 2, 2, 2, 0, 2, 1, 1};

    sortColor(ns);

    for (int i : ns) {

      System.out.println(i);

    }

  }

  public static void sortColors(int[] ns) {

    int red = 0, bule = 0, white = 0;

    for (int i = 0; i < ns.length; i++) {

      switch (ns[i]) {
        case 0:
          red++;
          break;
        case 1:
          white++;
          break;
        case 2:
          bule++;
          break;
      }

    }

    for (int i = 0; i < ns.length; i++) {
      if (red > 0) {
        ns[i] = 0;
        red--;
        continue;
      }
      if (white > 0) {
        ns[i] = 1;
        white--;
        continue;
      }
      ns[i] = 2;
    }

  }

  public static void sortColor(int[] ns) {

    if (ns.length == 0 || ns.length == 1) {
      return;
    }

    int redPoint = 0, bluePoint = ns.length - 1, i = 0;

    while (i <= bluePoint) {
      if (ns[i] == 0) {
        swap(ns, i++, redPoint++);
        continue;
      }
      if (ns[i] == 2) {
        swap(ns, i, bluePoint--);
        continue;
      }
      i++;
    }

  }

  public static void swap(int[] arr, int x, int y) {
    int temp = arr[x];
    arr[x] = arr[y];
    arr[y] = temp;
  }


}
