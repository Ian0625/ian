package org.hx.ian.designpattern.iterator;

/**
 * @ClassName Iterator
 * @Author hx 2018/11/27
 * @Description TODO
 * @Date 2018/11/27 11:35
 * @Version 1.0
 */
public interface Iterator {

  /**
   * 前移
   */
  Object previous();

  /**
   * 后移
   */
  Object next();

  boolean hasNext();

  /**
   * 取得第一个元素
   */
  Object first();

}
