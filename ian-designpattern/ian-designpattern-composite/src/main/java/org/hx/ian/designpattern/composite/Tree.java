package org.hx.ian.designpattern.composite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName Tree
 * @Author hx 2018/11/21
 * @Description TODO
 * @Date 2018/11/21 21:00
 * @Version 1.0
 */
public class Tree {

  private static final Logger LOGGER = LoggerFactory.getLogger(Tree.class);

  private TreeNode root = null;

  public Tree(String name) {
    this.root = new TreeNode(name);
  }

  public static void main(String[] args) {
    Tree tree = new Tree("A");
    TreeNode nodeB = new TreeNode("B");
    TreeNode nodeC = new TreeNode("C");

    nodeB.add(nodeC);
    tree.root.add(nodeB);

    LOGGER.info("build the tree finished!");
  }
}
