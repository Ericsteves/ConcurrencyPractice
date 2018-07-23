package com.cn.algorithm.practice.GetCommonLengthChars;

import com.cn.algorithm.practice.GetCommonLengthChars.entity.ListNode;

public class ListPartitionTest {

  public static void main(String[] args) {

    ListNode node1 = new ListNode(1);
    ListNode node2 = new ListNode(4);
    ListNode node3 = new ListNode(3);
    ListNode node4 = new ListNode(2);
    ListNode node5 = new ListNode(5);
    ListNode node6 = new ListNode(2);


    node1.next = node2;
    node2.next = node3;
    node3.next = node4;
    node4.next = node5;
    node5.next = node6;


    ListNode res = partition(node1,3);

    System.out.println(res.toString());


  }

  private static ListNode partition(ListNode list, int x) {

    ListNode leftDummy = new ListNode(0);
    ListNode left = leftDummy;
    ListNode rightDummy = new ListNode(0);
    ListNode right = rightDummy;

    ListNode node = list;

    while (node != null) {
      if (node.val < x) {
        left.next = node;
        left = left.next;
      } else {
        right.next = node;
        right = right.next;
      }

      node = node.next;
    }

    right.next = null;
    left.next = rightDummy.next;

    return leftDummy.next;
  }

}
