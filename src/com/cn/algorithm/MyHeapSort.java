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

  private static void heapSort(int[] array) {
    if (array == null || array.length == 0) {
      return;
    }
    buildMaxHeap(array);
    for (int i = array.length - 1; i >= 1; i--) {
      swap(array, 0, i);
      maxHeap(array, i, 0);
    }
  }

  private static void buildMaxHeap(int[] array) {
    if (array == null || array.length <= 1) {
      return;
    }
    int index = array.length / 2;
    for (int i = index; i >= 0; i--) {
      maxHeap(array, array.length, i);
    }
  }

  /**
   * 递归实现
   * @param array
   * @param heapSize
   * @param index
   */
//  private static void maxHeap(int[] array, int length, int index) {
//    int left = index * 2 + 1;
//    int right = index * 2 + 2;
//    int largest = index;
//    if (left < length && array[left] > array[index]) {
//      largest = left;
//    }
//    if (right < length && array[right] > array[largest]) {
//      largest = right;
//    }
//    if (index != largest) {
//      swap(array, index, largest);
//      maxHeap(array, length, largest);
//    }
//  }

  /**
   * 非递归实现
   *
   * @param array
   * @param heapSize
   * @param index
   */
  private static void maxHeap(int[] array, int heapSize, int index) {
    int left = 2 * index + 1;
    int right = 2 * index + 2;
    int largest = index;
    while (left < heapSize) {

      if (array[left] > array[index])
        largest = left;
      if (right < heapSize && array[right] > array[largest])
        largest = right;

      if (largest != index)
        swap(array, index, largest);
      else
        break;

      index = largest;
      left = 2 * index + 1;
      right = 2 * index + 2;
    }
  }

  private static void swap(int[] array, int i, int j) {
    int n = array[i];
    array[i] = array[j];
    array[j] = n;
  }
}
