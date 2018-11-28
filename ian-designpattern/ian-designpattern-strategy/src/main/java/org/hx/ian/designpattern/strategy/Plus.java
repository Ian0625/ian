package org.hx.ian.designpattern.strategy;

/**
 * @ClassName Plus
 * @Author hx 2018/11/27
 * @Description TODO
 * @Date 2018/11/27 10:57
 * @Version 1.0
 */
public class Plus extends AbstractCalculator implements ICalculator {

  @Override
  public int calculate(String exp) {
    int[] arrayInt = split(exp, "\\+");
    return arrayInt[0] + arrayInt[1];
  }
}
