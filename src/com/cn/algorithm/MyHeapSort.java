package com.cn.algorithm;

public class MyHeapSort {
  public static void main(String[] args) {
    int[] array = {87, 45, 78, 32, 17, 65, 53, 9, 122};
    heapSort(array);
    System.out.print("{");
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i]);
      if (i < array.length - 1) {
        System.out.print(", ");
      }
    }
    System.out.println("}");
  }

  public static void heapSort(int[] array) {
    if (array.length < 0 || array == null) {
      return;
    }
    buildMaxHeap(array);
    for (int i = array.length - 1; i >= 1; i--) {
      swarp(array, 0, i);
      maxHeap(array, i, 0);
    }
  }

  public static void buildMaxHeap(int[] array) {
    if (array == null || array.length <= 1) {
      return;
    }
    int index = array.length / 2;
    for (int i = index; i >= 0; i--) {
      maxHeap(array, array.length, i);
    }
  }

  public static void maxHeap(int[] array, int length, int index) {
    int left = index * 2 + 1;
    int right = index * 2 + 2;
    int largest = index;
    if (left < length && array[left] > array[index]) {
      largest = left;
    }
    if (right < length && array[right] > array[largest]) {
      largest = right;
    }
    if (index != largest) {
      swarp(array, index, largest);
      maxHeap(array, length, largest);
    }
  }

  public static void swarp(int[] array, int i, int j) {
    int n = array[i];
    array[i] = array[j];
    array[j] = n;
  }
}
