package org.hx.ian.designpattern.facade;

/**
 * @ClassName User
 * @Author hx 2018/11/19
 * @Description TODO
 * @Date 2018/11/19 21:35
 * @Version 1.0
 */
public class User {

  public static void main(String[] args) {
    Computer computer = new Computer();
    computer.startup();
    computer.shutdown();
  }

}
