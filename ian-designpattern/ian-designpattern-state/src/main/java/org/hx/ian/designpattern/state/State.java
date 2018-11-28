package org.hx.ian.designpattern.state;

/**
 * @ClassName State
 * @Author hx 2018/11/28
 * @Description 状态类的核心类
 * @Date 2018/11/28 09:20
 * @Version 1.0
 */
public class State {

  private String value;

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public void method1() {
    System.out.println("execute the first opt!");
  }

  public void method2() {
    System.out.println("execute the second opt!");
  }
}
