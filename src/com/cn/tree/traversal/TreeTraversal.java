package com.cn.tree.traversal;

import java.util.Stack;

public class TreeTraversal {


  /**
   *
   * @param root
   */
  public static void recursionPreorderTraversal(TreeNode root) {

    if (root != null) {
      System.out.println(root.getValue());
      recursionPreorderTraversal(root.getLeft());
      recursionPreorderTraversal(root.getRight());
    }

  }

  public static void preorderTraversal(TreeNode root) {
    Stack<TreeNode> stack = new Stack<>();
    TreeNode current = root;

    while (current != null || !stack.isEmpty()) {
      while (current != null) {
        System.out.println(current.getValue());
        stack.push(current);
        current = current.getLeft();
      }
      if (!stack.isEmpty()) {
        current = stack.pop();
        current = current.getRight();
      }
    }

  }

  public static void recursionMiddleorderTraversal(TreeNode root) {

    if (root != null) {
      recursionMiddleorderTraversal(root.getLeft());
      System.out.println(root.getValue());
      recursionMiddleorderTraversal(root.getRight());
    }

  }

  public static void middleorderTraversal(TreeNode root) {
    Stack<TreeNode> stack = new Stack<>();
    TreeNode current = root;
    while (current != null || !stack.isEmpty()) {
      while (current != null) {
        stack.push(current);
        current = current.getLeft();
      }
      if (!stack.isEmpty()) {
        current = stack.pop();
        System.out.println(current.getValue());
        current = current.getRight();
      }
    }
  }

  public static void recursionPostorderTraversal(TreeNode root) {
    if (root != null) {
      recursionPostorderTraversal(root.getLeft());
      recursionPostorderTraversal(root.getRight());
      System.out.println(root.getValue());
    }
  }

  public static void postorderTraversal(TreeNode root) {

    Stack<TreeNode> stack = new Stack<>();
    TreeNode current = root;
    TreeNode lastVisit = root;
    while (current != null || !stack.isEmpty()) {

      while (current != null) {
        stack.push(current);
        current = current.getLeft();
      }

      current = stack.peek();
      if (current.getRight() == null || current.getRight() == lastVisit) {
        System.out.println(current.getValue());
        stack.pop();
        lastVisit = current;
        current = null;
      } else {
        current = current.getRight();
      }

    }

  }

}
