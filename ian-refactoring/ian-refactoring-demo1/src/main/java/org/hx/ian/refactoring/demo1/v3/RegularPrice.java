package org.hx.ian.refactoring.demo1.v3;

/**
 * @ClassName RegularPrice
 * @Author hx 2018/11/26
 * @Description TODO
 * @Date 2018/11/26 17:09
 * @Version 1.0
 */
public class RegularPrice extends Price {

  @Override
  public int getPriceCode() {
    return Movie.REGULAR;
  }

  @Override
  public double getCharge(int daysRented) {
    double result = 2;
    if (daysRented > 2) {
      result += (daysRented - 2) * 1.5;
    }
    return result;
  }
}
