package org.hx.ian.designpattern.templatemethod;

/**
 * @ClassName StrategyTest
 * @Author hx 2018/11/27
 * @Description TODO
 * @Date 2018/11/27 11:15
 * @Version 1.0
 */
public class StrategyTest {

  public static void main(String[] args) {
    String exp = "8+8";
    AbstractCalculator cal = new Plus();
    int result = cal.calculate(exp, "\\+");
    System.out.println(result);
  }

}
