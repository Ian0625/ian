package org.hx.ian.refactoring.demo1.v3;

/**
 * @ClassName Price
 * @Author hx 2018/11/26
 * @Description TODO
 * @Date 2018/11/26 17:08
 * @Version 1.0
 */
public abstract class Price {

  public abstract int getPriceCode();

  public abstract double getCharge(int daysRented);

  public int getFrequentRenterPoints(int daysRented) {
    return 1;
  }

}
