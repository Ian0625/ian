package org.hx.ian.designpattern.command;

/**
 * @ClassName Test
 * @Author hx 2018/11/27
 * @Description TODO
 * @Date 2018/11/27 17:58
 * @Version 1.0
 */
public class Test {

  public static void main(String[] args) {
    Receiver receiver = new Receiver();
    Command cmd = new MyCommand(receiver);
    Invoker invoker = new Invoker(cmd);
    invoker.action();
  }

}
