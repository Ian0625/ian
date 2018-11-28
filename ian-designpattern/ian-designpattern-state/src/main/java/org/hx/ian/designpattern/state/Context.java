package org.hx.ian.designpattern.state;

/**
 * @ClassName Context
 * @Author hx 2018/11/28
 * @Description 状态模式切换类
 * @Date 2018/11/28 09:22
 * @Version 1.0
 */
public class Context {

  private State state;

  public Context(State state) {
    this.state = state;
  }

  public State getState() {
    return state;
  }

  public void setState(State state) {
    this.state = state;
  }

  public void method() {
    if (state.getValue().equals("state1")) {
      state.method1();
    } else if (state.getValue().equals("state2")) {
      state.method2();
    }
  }
}
