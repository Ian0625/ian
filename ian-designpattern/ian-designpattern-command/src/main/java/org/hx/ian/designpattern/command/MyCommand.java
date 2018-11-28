package org.hx.ian.designpattern.command;

/**
 * @ClassName MyCommand
 * @Author hx 2018/11/27
 * @Description TODO
 * @Date 2018/11/27 17:56
 * @Version 1.0
 */
public class MyCommand implements Command {

  private Receiver receiver;

  public MyCommand(Receiver receiver) {
    this.receiver = receiver;
  }

  @Override
  public void exec() {
    receiver.action();
  }
}
