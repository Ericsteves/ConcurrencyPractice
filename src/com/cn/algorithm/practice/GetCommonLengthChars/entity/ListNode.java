package com.cn.algorithm.practice.GetCommonLengthChars.entity;

public class ListNode {
  public int val;
  public ListNode next = null;

  public ListNode(int val) {
    this.val = val;
  }

  public int getVal() {
    return val;
  }

  public void setVal(int val) {
    this.val = val;
  }

  public ListNode getNext() {
    return next;
  }

  public void setNext(ListNode next) {
    this.next = next;
  }

  public String toString() {
    StringBuffer sb = new StringBuffer();
    ListNode node = this;
    while (node.next != null) {
      sb.append(node.val + " ");
      node = node.next;
    }
    sb.append(node.val);
    return sb.toString();
  }
}
