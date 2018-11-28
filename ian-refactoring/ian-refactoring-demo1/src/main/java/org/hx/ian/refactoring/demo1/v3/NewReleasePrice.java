package org.hx.ian.refactoring.demo1.v3;

/**
 * @ClassName NewReleasePrice
 * @Author hx 2018/11/26
 * @Description TODO
 * @Date 2018/11/26 17:10
 * @Version 1.0
 */
public class NewReleasePrice extends Price {

  @Override
  public int getPriceCode() {
    return Movie.NEW_RELEASE;
  }

  @Override
  public double getCharge(int daysRented) {
    return daysRented * 3;
  }

  @Override
  public int getFrequentRenterPoints(int daysRented) {
    return (daysRented > 1) ? 2 : 1;
  }
}
