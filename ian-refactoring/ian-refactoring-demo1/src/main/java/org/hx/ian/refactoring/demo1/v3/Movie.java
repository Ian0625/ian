package org.hx.ian.refactoring.demo1.v3;

/**
 * @ClassName Movie
 * @Author hx 2018/11/26
 * @Description TODO
 * @Date 2018/11/26 16:08
 * @Version 1.0
 */
public class Movie {

  public static final int CHILDRENS = 2;
  public static final int REGULAR = 0;
  public static final int NEW_RELEASE = 1;

  private String title;

  private Price price;

  public Movie(String title, int priceCode) {
    this.title = title;
    setPriceCode(priceCode);
  }

  public String getTitle() {
    return title;
  }

  public int getPriceCode() {
    return price.getPriceCode();
  }

  public void setPriceCode(int priceCode) {
    switch (priceCode) {
      case REGULAR:
        price = new RegularPrice();
        break;
      case CHILDRENS:
        price = new ChildrenPrice();
        break;
      case NEW_RELEASE:
        price = new NewReleasePrice();
        break;
      default:
        throw new IllegalArgumentException("Incorrect Price Code");
    }
  }

  public double getCharge(int daysRented) {
    return price.getCharge(daysRented);
  }

  public int getFrequentRenterPoints(int daysRented) {
    return price.getFrequentRenterPoints(daysRented);
  }
}
