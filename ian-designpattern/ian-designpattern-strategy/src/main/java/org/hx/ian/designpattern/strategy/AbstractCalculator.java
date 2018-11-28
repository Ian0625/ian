package org.hx.ian.designpattern.strategy;

/**
 * @ClassName AbstractCalculator
 * @Author hx 2018/11/27
 * @Description TODO
 * @Date 2018/11/27 10:54
 * @Version 1.0
 */
public class AbstractCalculator {

  public int[] split(String exp, String opt) {
    String[] array = exp.split(opt);
    int[] arrayInt = new int[2];
    arrayInt[0] = Integer.parseInt(array[0]);
    arrayInt[1] = Integer.parseInt(array[1]);
    return arrayInt;
  }
}
