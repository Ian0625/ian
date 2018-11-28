package org.hx.ian.designpattern.observer;

/**
 * @ClassName Observer2
 * @Author hx 2018/11/27
 * @Description TODO
 * @Date 2018/11/27 11:21
 * @Version 1.0
 */
public class Observer2 implements Observer {

  @Override
  public void update() {
    System.out.println("observer2 has received!");
  }
}
