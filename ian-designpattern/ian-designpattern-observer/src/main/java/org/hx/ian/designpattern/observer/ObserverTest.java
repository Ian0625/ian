package org.hx.ian.designpattern.observer;

/**
 * @ClassName ObserverTest
 * @Author hx 2018/11/27
 * @Description TODO
 * @Date 2018/11/27 11:25
 * @Version 1.0
 */
public class ObserverTest {

  public static void main(String[] args) {
    Subject sub = new MySubject();
    sub.add(new Observer1());
    sub.add(new Observer2());
    sub.operation();
  }

}
