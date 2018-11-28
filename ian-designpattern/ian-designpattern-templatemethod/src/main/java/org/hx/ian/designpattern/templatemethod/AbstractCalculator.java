package org.hx.ian.designpattern.templatemethod;

/**
 * @ClassName AbstractCalculator
 * @Author hx 2018/11/27
 * @Description TODO
 * @Date 2018/11/27 11:10
 * @Version 1.0
 */
public abstract class AbstractCalculator {

  /**
   * 主方法，实现对本类其他方法的调用
   */
  public final int calculate(String exp, String opt) {
    int array[] = split(exp, opt);
    return calculate(array[0], array[1]);
  }

  /**
   * 需要被子类重写的方法
   */
  protected abstract int calculate(int num1, int num2);

  private int[] split(String exp, String opt) {
    String[] array = exp.split(opt);
    int[] arrayInt = new int[2];
    arrayInt[0] = Integer.parseInt(array[0]);
    arrayInt[1] = Integer.parseInt(array[1]);
    return arrayInt;
  }

}
