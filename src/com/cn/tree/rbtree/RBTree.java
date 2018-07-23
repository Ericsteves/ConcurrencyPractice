package com.cn.tree.rbtree;

import java.util.concurrent.atomic.AtomicLong;

public class RBTree<T extends Comparable<T>> {

  private RBTreeNode<T> root;

  private AtomicLong size = new AtomicLong(0);

  private volatile boolean overrideMode = true;

  public RBTree() {
    root = new RBTreeNode<T>();
  }

  public RBTree(boolean overrideMode) {
    this();
    this.overrideMode = overrideMode;
  }

  public boolean isOverrideMode() {
    return overrideMode;
  }

  public void setOverrideMode(boolean overrideMode) {
    this.overrideMode = overrideMode;
  }

  public long getSize() {
    return size.get();
  }

  public RBTreeNode<T> getRoot() {
    return root.getLeft();
  }


  private T addNode(RBTreeNode<T> node) {
    node.setLeft(null);
    node.setRight(null);
    node.setRed(true);
    setParent(node, null);
    if (root.getLeft() == null) {
      root.setLeft(node);
      node.setRed(false);
      size.incrementAndGet();
    } else {
      RBTreeNode<T> x = findParentNode(node);
    }
    return null;
  }

  private void setParent(RBTreeNode<T> node, RBTreeNode<T> parent) {
    if (node != null) {
      node.setParent(parent);
      if (parent == root) {
        node.setParent(null);
      }
    }
  }

  private RBTreeNode<T> findParentNode(RBTreeNode<T> node) {
    RBTreeNode<T> dataRoot = getRoot();
    RBTreeNode<T> child = dataRoot;

    while (child != null) {
      int n = child.getValue().compareTo(node.getValue());
      if (n == 0) {
        return child;
      } else if (n > 0) {
        dataRoot = child;
        child = child.getLeft();
      } else {
        dataRoot = child;
        child = child.getRight();
      }
    }
    return dataRoot;
  }

  private void leftRotate(RBTreeNode<T> x) {

    RBTreeNode<T> y = x.getRight();           //获取右节点

    x.setRight(y.getLeft());                  //将x.right设置成 y.left
    if (y.getLeft() != null)
      y.getLeft().setParent(x);

    if (x.getParent() == null)                //如果x为root，那么y就设置成root
      this.root = y;
    else {
      y.setParent(x.getParent());             //如果x.parent不为空，那么y.parent = x.parent
      if (x.getParent().getLeft() == x)       //如果x为左子节点，那么x.parent.left = y
        x.getParent().setLeft(y);
      else
        x.getParent().setRight(y);            //如果x为右子节点，那么x.parent.right = y
    }

    y.setLeft(x);                             //y.left = x.parent
    x.setParent(y);

  }

  private void rightRotate(RBTreeNode<T> x){

    RBTreeNode<T> y = x.getLeft();

    x.setLeft(y.getRight());
    if(y.getRight()!=null)
      y.getRight().setParent(x);

    if(x.getParent()==null)
      this.root = y;
    else{
      y.setParent(x.getParent());
      if(x.getParent().getLeft() == x)
        x.getParent().setLeft(y);
      else
        x.getParent().setRight(y);
    }

    y.setLeft(x);
    x.setParent(y);

  }
}
