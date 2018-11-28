package org.hx.ian.refactoring.demo1.v3;

/**
 * @ClassName ChildrenPrice
 * @Author hx 2018/11/26
 * @Description TODO
 * @Date 2018/11/26 17:10
 * @Version 1.0
 */
public class ChildrenPrice extends Price {

  @Override
  public int getPriceCode() {
    return Movie.CHILDRENS;
  }

  @Override
  public double getCharge(int daysRented) {
    double result = 1.5;
    if (daysRented > 3) {
      result += (daysRented - 3) * 1.5;
    }
    return result;
  }
}
