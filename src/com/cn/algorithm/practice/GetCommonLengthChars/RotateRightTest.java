package com.cn.algorithm.practice.GetCommonLengthChars;

import com.cn.algorithm.practice.GetCommonLengthChars.entity.ListNode;

public class RotateRightTest {

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

    System.out.println(node1.toString());
    ListNode res = rotateRight(node1, 4);

    System.out.println(res.toString());


  }

  private static ListNode rotateRight(ListNode head, int n) {

    if (head == null || n == 0)
      return head;

    ListNode point = head;
    int length = 1;

    while (point.next != null) {
      point = point.next;
      length++;
    }

    point.next = head;

    n = n % length;

    for (int i = 0; i < length - n; i++) {
      point = point.next;
    }

    head = point.next;
    point.next = null;

    return head;
  }


}
