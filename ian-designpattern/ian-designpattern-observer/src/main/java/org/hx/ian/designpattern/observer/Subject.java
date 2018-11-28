package org.hx.ian.designpattern.observer;

/**
 * @ClassName Subject
 * @Author hx 2018/11/27
 * @Description TODO
 * @Date 2018/11/27 11:21
 * @Version 1.0
 */
public interface Subject {

  /**
   * 增加观察者
   */
  void add(Observer observer);

  /**
   * 删除观察者
   */
  void del(Observer observer);

  /**
   * 通知所有的观察者
   */
  void notifyObservers();

  /**
   * 自身操作
   */
  void operation();

}
