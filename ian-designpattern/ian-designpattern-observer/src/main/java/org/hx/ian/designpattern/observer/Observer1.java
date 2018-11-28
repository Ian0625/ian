package org.hx.ian.designpattern.observer;

/**
 * @ClassName Observer1
 * @Author hx 2018/11/27
 * @Description TODO
 * @Date 2018/11/27 11:20
 * @Version 1.0
 */
public class Observer1 implements Observer {

  @Override
  public void update() {
    System.out.println("observer1 has received!");
  }
}
