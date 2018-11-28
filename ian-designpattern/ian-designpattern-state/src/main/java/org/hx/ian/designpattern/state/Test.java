package org.hx.ian.designpattern.state;

/**
 * @ClassName Test
 * @Author hx 2018/11/28
 * @Description TODO
 * @Date 2018/11/28 09:23
 * @Version 1.0
 */
public class Test {

  public static void main(String[] args) {
    State state = new State();

    Context context = new Context(state);

    // 设置第一种状态
    state.setValue("state1");
    context.method();

    // 设置第二种状态
    state.setValue("state2");
    context.method();
  }

}
