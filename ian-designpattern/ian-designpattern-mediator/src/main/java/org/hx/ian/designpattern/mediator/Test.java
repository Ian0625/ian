package org.hx.ian.designpattern.mediator;

/**
 * @ClassName Test
 * @Author hx 2018/11/28
 * @Description TODO
 * @Date 2018/11/28 09:41
 * @Version 1.0
 */
public class Test {

  public static void main(String[] args) {
    Mediator mediator = new MyMediator();
    mediator.createMediator();
    mediator.workAll();
  }

}
