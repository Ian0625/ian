package org.hx.ian.designpattern.templatemethod;

/**
 * @ClassName Plus
 * @Author hx 2018/11/27
 * @Description TODO
 * @Date 2018/11/27 11:15
 * @Version 1.0
 */
public class Plus extends AbstractCalculator {

  @Override
  protected int calculate(int num1, int num2) {
    return num1 + num2;
  }
}
