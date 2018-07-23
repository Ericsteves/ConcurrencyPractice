package com.cn.algorithm.practice.GetCommonLengthChars;

public class FindKthLargestTest {

  public static void main(String[] args) {

    int[] ns = new int[]{1, 3, 2, 7, 4, -1, 9, 10, 7, 7, 7, 7, 7};
    System.out.println(findKthLargest(ns, 5));

  }

  private static int findKthLargest(int[] ns, int k) {
    if (ns == null || ns.length == 0 || k > ns.length)
      return -1;

    int res = -1, heapSize = ns.length;
    int[] heap = new int[heapSize];

    if (heapSize == 1)
      return ns[0];

    for (int i = 0; i < heapSize; i++) {
      buildHeap(heap, i, ns[i]);
    }

    for (int j = 0; j < k; j++) {
      res = heap[0];
      if (j == k - 1)
        return res;
      swap(heap, 0, heapSize - 1);
      heapify(heap, 0, --heapSize);

    }

    return res;
  }

  private static void buildHeap(int[] heap, int index, int value) {
    heap[index] = value;
    while (index != 0) {
      int parent = (index - 1) >> 1;
      if (heap[parent] < heap[index]) {
        swap(heap, parent, index);
        index = parent;
      } else {
        break;
      }
    }
  }

  private static void heapify(int[] heap, int index, int heapSize) {

    int left = 2 * index + 1;
    int right = 2 * index + 2;
    int largest = index;

    while (left <= heapSize) {
      if (heap[left] > heap[largest])
        largest = left;
      if (right <= heapSize && heap[right] > heap[largest])
        largest = right;

      if (largest != index)
        swap(heap, index, largest);
      else
        break;

      index = largest;
      left = 2 * index + 1;
      right = 2 * index + 2;
    }

  }

  private static void swap(int[] ns, int x, int y) {
    int temp = ns[x];
    ns[x] = ns[y];
    ns[y] = temp;
  }


}
