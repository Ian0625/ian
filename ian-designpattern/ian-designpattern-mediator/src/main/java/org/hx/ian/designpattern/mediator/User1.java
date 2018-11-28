package org.hx.ian.designpattern.mediator;

/**
 * @ClassName User1
 * @Author hx 2018/11/28
 * @Description TODO
 * @Date 2018/11/28 09:37
 * @Version 1.0
 */
public class User1 extends User {

  public User1(Mediator mediator) {
    super(mediator);
  }

  @Override
  public void work() {
    System.out.println("user1 exe!");
  }
}
