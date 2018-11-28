package org.hx.ian.designpattern.strategy;

/**
 * @ClassName Multiply
 * @Author hx 2018/11/27
 * @Description TODO
 * @Date 2018/11/27 10:59
 * @Version 1.0
 */
public class Multiply extends AbstractCalculator implements ICalculator {

  @Override
  public int calculate(String exp) {
    int[] arrayInt = split(exp, "\\*");
    return arrayInt[0] * arrayInt[1];
  }
}
