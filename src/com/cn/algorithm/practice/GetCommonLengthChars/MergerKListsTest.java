package com.cn.algorithm.practice.GetCommonLengthChars;

import com.cn.algorithm.practice.GetCommonLengthChars.entity.ListNode;

public class MergerKListsTest {

  public static void main(String[] args) {

    ListNode node1 = new ListNode(-1);   //sorted listnode
    ListNode node2 = new ListNode(2);
    ListNode node3 = new ListNode(3);
    ListNode node4 = new ListNode(4);
    ListNode node5 = new ListNode(5);

    node1.setNext(node2);
    node2.setNext(node3);
    node3.setNext(node4);
    node4.setNext(node5);


    ListNode node6 = new ListNode(-10);   //sorted listnode
    ListNode node7 = new ListNode(10);
    ListNode node8 = new ListNode(13);
    ListNode node9 = new ListNode(15);
    ListNode node10 = new ListNode(21);

    node6.next = node7;
    node7.next = node8;
    node8.next = node9;
    node9.next = node10;

    ListNode[] lists = new ListNode[]{node1, node6};

    ListNode node = mergerKLists(lists);
    System.out.println(node.toString());


  }

  private static ListNode mergerKLists(ListNode[] lists) {
    return mergerKLists(lists, 0, lists.length - 1);
  }

  private static ListNode mergerKLists(ListNode[] lists, int start, int end) {
    while (start < end) {
      int half = (start + end) >> 1;
      return merger(mergerKLists(lists, start, half), mergerKLists(lists, half + 1, end));
    }
    return lists[start];
  }

  private static ListNode merger(ListNode node1, ListNode node2) {

    if (node1 == null)
      return node2;
    if (node2 == null)
      return node1;

    if (node1.val < node2.val) {
      node1.next = merger(node1.next, node2);
      return node1;
    } else {
      node2.next = merger(node1, node2.next);
      return node2;
    }

  }


}
