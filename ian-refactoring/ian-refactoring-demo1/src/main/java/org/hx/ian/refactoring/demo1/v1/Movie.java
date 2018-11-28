package org.hx.ian.refactoring.demo1.v1;

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

  private int priceCode;

  public Movie(String title, int priceCode) {
    this.title = title;
    this.priceCode = priceCode;
  }

  public String getTitle() {
    return title;
  }

  public int getPriceCode() {
    return priceCode;
  }

  public void setPriceCode(int priceCode) {
    this.priceCode = priceCode;
  }
}
