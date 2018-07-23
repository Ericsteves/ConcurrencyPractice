package com.cn.algorithm.practice.GetCommonLengthChars;

public class GetTopN {

  public static void main(String[] args) {

    int[][] ns = new int[][]{
        {13, 7, 3, 0},
        {8, 6, 5, 1},
        {10, 9, 4, 2},
        {50, 40, 33, -10}};

    int[] result = getTopN(ns, ns.length);

    assert result != null;
    for (int i : result) {
      System.out.println(i);
    }

  }

  private static int[] getTopN(int[][] ns, int topN) {

    int heapSize = ns.length;

    if (heapSize == 0 || heapSize < topN)
      return null;

    int[] result = new int[topN];
    Node[] arr = new Node[topN];

    for (int i = 0; i < topN; i++) {
      Node node = new Node(ns[i][0], i, 0);
      buildHeap(arr, i, node);
    }

    for (int j = 0; j < topN; j++) {
      if (heapSize == 0)
        return null;
      result[j] = arr[0].value;
      if (arr[0].col != topN - 1)
        arr[0].value = ns[arr[0].row][++arr[0].col];
      else
        swap(arr, 0, --heapSize);
      heapify(arr, 0, heapSize);
    }
    return result;

  }

  private static void buildHeap(Node[] arr, int index, Node node) {

    arr[index] = node;

    while (index != 0) {
      int parent = (index - 1) >> 1;
      if (arr[parent].value < arr[index].value) {
        swap(arr, parent, index);
        index = parent;
      } else {
        break;
      }
    }
  }

  private static void heapify(Node[] arr, int index, int heapSize) {
    int left = 2 * index + 1;
    int right = 2 * index + 2;
    int largest = index;
    while (left < heapSize) {

      if (arr[left].value > arr[largest].value) {
        largest = left;
      }
      if (right < heapSize && arr[right].value > arr[largest].value) {
        largest = right;
      }

      if (largest != index)
        swap(arr, index, largest);
      else
        break;

      index = largest;
      left = 2 * index + 1;
      right = 2 * index + 2;

    }
  }

  private static void swap(Node[] arr, int x, int y) {
    Node temp = arr[x];
    arr[x] = arr[y];
    arr[y] = temp;
  }

  private static class Node {
    int value;
    int col;
    int row;

    Node(int value, int row, int col) {
      this.value = value;
      this.row = row;
      this.col = col;
    }

    public String toString() {
      return "" + value;
    }
  }

}
