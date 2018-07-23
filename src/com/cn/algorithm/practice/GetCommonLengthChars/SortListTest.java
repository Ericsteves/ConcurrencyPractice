package com.cn.algorithm.practice.GetCommonLengthChars;


import com.cn.algorithm.practice.GetCommonLengthChars.entity.ListNode;

public class SortListTest {

  public static void main(String[] args) {

    ListNode node1 = new ListNode(4);
    ListNode node2 = new ListNode(-1);
    ListNode node3 = new ListNode(3);
    ListNode node4 = new ListNode(2);
    ListNode node5 = new ListNode(5);

    node1.setNext(node2);
    node2.setNext(node3);
    node3.setNext(node4);
    node4.setNext(node5);
    System.out.println(node1.toString());
    ListNode ss = sortList(node1);
    System.out.println(ss.toString());


  }

  public static ListNode sortList(ListNode head) {

    if (head == null || head.next == null) return head;
    ListNode slow = head, fast = head, pre = head;
    while (fast != null && fast.next != null) {
      pre = slow;
      slow = slow.next;
      fast = fast.next.next;
    }
    pre.next = null;
    return merge(sortList(head), sortList(slow));
  }


  public static ListNode merge(ListNode l1, ListNode l2) {

    if (l1 == null) return l2;
    if (l2 == null) return l1;
    if (l1.val < l2.val) {
      l1.next = merge(l1.next, l2);
      return l1;
    } else {
      l2.next = merge(l1, l2.next);
      return l2;
    }
  }

}

