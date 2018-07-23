package com.cn.tree.rbtree;

public class RBTreeNode<T extends Comparable<T>> {

  private T value;
  private RBTreeNode<T> left;
  private RBTreeNode<T> right;
  private RBTreeNode<T> parent;
  private boolean isRed;

  public RBTreeNode() {}

  public RBTreeNode(T value) {
    this.value = value;
  }

  public RBTreeNode(T value, boolean isRed) {
    this.value = value;
    this.isRed = isRed;
  }

  public T getValue() {
    return value;
  }

  public void setValue(T value) {
    this.value = value;
  }

  public RBTreeNode<T> getLeft() {
    return left;
  }

  public void setLeft(RBTreeNode<T> left) {
    this.left = left;
  }

  public RBTreeNode<T> getRight() {
    return right;
  }

  public void setRight(RBTreeNode<T> right) {
    this.right = right;
  }

  public RBTreeNode<T> getParent() {
    return parent;
  }

  public void setParent(RBTreeNode<T> parent) {
    this.parent = parent;
  }

  public boolean isRed() {
    return isRed;
  }

  public boolean isBlack(){
    return !isRed;
  }

  public void setRed(boolean red) {
    isRed = red;
  }

  public boolean isLeaf(){
    return left==null && right==null;
  }

  public void makeRed(){
    this.isRed = true;
  }

  public void makeBlack(){
    this.isRed = false;
  }
}
