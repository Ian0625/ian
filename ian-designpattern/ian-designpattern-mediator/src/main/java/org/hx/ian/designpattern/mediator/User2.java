package org.hx.ian.designpattern.mediator;

/**
 * @ClassName User2
 * @Author hx 2018/11/28
 * @Description TODO
 * @Date 2018/11/28 09:38
 * @Version 1.0
 */
public class User2 extends User {

  public User2(Mediator mediator) {
    super(mediator);
  }

  @Override
  public void work() {
    System.out.println("user2 exe!");
  }
}
