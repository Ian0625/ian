package org.hx.ian.designpattern.iterator;

/**
 * @ClassName Collection
 * @Author hx 2018/11/27
 * @Description TODO
 * @Date 2018/11/27 11:32
 * @Version 1.0
 */
public interface Collection {

  Iterator iterator();

  /**
   * 取得集合元素
   */
  Object get(int i);

  /**
   * 取得集合大小
   */
  int size();

}
