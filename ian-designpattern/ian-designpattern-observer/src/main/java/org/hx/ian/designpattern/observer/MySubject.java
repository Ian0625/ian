package org.hx.ian.designpattern.observer;

/**
 * @ClassName MySubject
 * @Author hx 2018/11/27
 * @Description TODO
 * @Date 2018/11/27 11:25
 * @Version 1.0
 */
public class MySubject extends AbstractSubject {

  @Override
  public void operation() {
    System.out.println("update self!");
    notifyObservers();
  }
}
