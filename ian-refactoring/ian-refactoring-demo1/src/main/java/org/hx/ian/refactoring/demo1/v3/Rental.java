package org.hx.ian.refactoring.demo1.v3;

/**
 * @ClassName Rental
 * @Author hx 2018/11/26
 * @Description TODO
 * @Date 2018/11/26 16:10
 * @Version 1.0
 */
public class Rental {

  private Movie movie;

  private int daysRented;

  public Rental(Movie movie, int daysRented) {
    this.movie = movie;
    this.daysRented = daysRented;
  }

  public Movie getMovie() {
    return movie;
  }

  public int getDaysRented() {
    return daysRented;
  }

  public double getCharge() {
    return movie.getCharge(daysRented);
  }

  public int getFrequentRenterPoints() {
    return movie.getFrequentRenterPoints(daysRented);
  }
}
