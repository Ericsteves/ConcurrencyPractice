package com.cn.algorithm;

public class QuickSort {
  public static void main(String[] args) {
    int[] ns = {7, 4, 8, 10, 3, 2, 1, 1, 3, 4};
    int low = 0;
    int high = ns.length - 1;
    quickSort(ns, low, high);
    for (int i = 0; i < ns.length; i++) {
      System.out.print(ns[i] + "\t");
    }
  }

  public static void quickSort(int[] ns, int low, int high) {
    if (low < high) {
      int p = partition(ns, low, high);
      //System.out.println(p);
      quickSort(ns, low, p - 1);
      quickSort(ns, p + 1, high);
    }
  }

  public static int partition(int[] ns, int low, int high) {
    int start = low;
    int end = high;
    int key = ns[low];
    while (end > start) {
      while (end > start && ns[end] >= key) {
        end--;
      }
      if (ns[end] < key) {
        int temp = ns[start];
        ns[start] = ns[end];
        ns[end] = temp;
      }

      while (end > start && ns[start] <= key) {
        start++;
      }
      if (ns[start] > key) {
        int temp = ns[start];
        ns[start] = ns[end];
        ns[end] = temp;
      }

    }
    return start;
  }
}
