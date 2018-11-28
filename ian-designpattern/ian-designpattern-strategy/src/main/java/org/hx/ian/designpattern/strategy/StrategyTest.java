package org.hx.ian.designpattern.strategy;

/**
 * @ClassName StrategyTest
 * @Author hx 2018/11/27
 * @Description TODO
 * @Date 2018/11/27 11:01
 * @Version 1.0
 */
public class StrategyTest {

  public static void main(String[] args) {
    String exp = "2*8";
    ICalculator cal = new Multiply();
    int result = cal.calculate(exp);
    System.out.println(result);
  }

}
