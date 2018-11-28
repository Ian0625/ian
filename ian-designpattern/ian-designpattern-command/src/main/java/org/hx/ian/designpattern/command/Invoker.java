package org.hx.ian.designpattern.command;

/**
 * @ClassName Invoker
 * @Author hx 2018/11/27
 * @Description TODO
 * @Date 2018/11/27 17:58
 * @Version 1.0
 */
public class Invoker {

  private Command command;

  public Invoker(Command command) {
    this.command = command;
  }

  public void action() {
    command.exec();
  }
}
