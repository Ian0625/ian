package org.hx.ian.designpattern.interpreter;

/**
 * @ClassName Plus
 * @Author hx 2018/11/28
 * @Description TODO
 * @Date 2018/11/28 09:45
 * @Version 1.0
 */
public class Plus implements Expression {

  @Override
  public int interpret(Context context) {
    return context.getNum1() + context.getNum2();
  }
}
