package org.hx.ian.designpattern.mediator;

/**
 * @ClassName User
 * @Author hx 2018/11/28
 * @Description TODO
 * @Date 2018/11/28 09:37
 * @Version 1.0
 */
public abstract class User {

  private Mediator mediator;

  public Mediator getMediator() {
    return mediator;
  }

  public User(Mediator mediator) {
    this.mediator = mediator;
  }

  public abstract void work();
}
