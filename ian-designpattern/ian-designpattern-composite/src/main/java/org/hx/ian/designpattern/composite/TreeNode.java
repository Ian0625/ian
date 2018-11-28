package org.hx.ian.designpattern.composite;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @ClassName TreeNode
 * @Author hx 2018/11/21
 * @Description TODO
 * @Date 2018/11/21 20:57
 * @Version 1.0
 */
public class TreeNode {

  private String name;

  private TreeNode parent;

  private Vector<TreeNode> children = new Vector<>();

  public TreeNode(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TreeNode getParent() {
    return parent;
  }

  public void setParent(TreeNode parent) {
    this.parent = parent;
  }

  public void add(TreeNode node) {
    children.add(node);
  }

  public void remove(TreeNode node) {
    children.remove(node);
  }

  public Enumeration<TreeNode> getChildren() {
    return children.elements();
  }
}
