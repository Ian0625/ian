package org.hx.ian.refactoring.demo1.v3;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @ClassName Customer
 * @Author hx 2018/11/26
 * @Description TODO
 * @Date 2018/11/26 16:07
 * @Version 1.0
 */
public class Customer {

  private String name;

  private Vector rentals = new Vector();

  public Customer(String name) {
    this.name = name;
  }

  public void addRental(Rental arg) {
    rentals.add(arg);
  }

  public String getName() {
    return name;
  }

  public String statement() {
    Enumeration rentalEnums = rentals.elements();
    String result = "Rental Record for " + getName() + "\n";
    while (rentalEnums.hasMoreElements()) {
      Rental each = (Rental) rentalEnums.nextElement();
      // show figures for this rental
      result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";
    }

    // add footer lines
    result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
    result +=
        "You earned " + String.valueOf(getTotalFrequentRenterPoints()) + " frequent renter points";
    return result;
  }

  private double getTotalFrequentRenterPoints() {
    int result = 0;
    Enumeration rentalEnums = rentals.elements();
    while (rentalEnums.hasMoreElements()) {
      Rental each = (Rental) rentalEnums.nextElement();
      result += each.getFrequentRenterPoints();
    }
    return result;
  }

  private double getTotalCharge() {
    double result = 0;
    Enumeration rentalEnums = rentals.elements();
    while (rentalEnums.hasMoreElements()) {
      Rental each = (Rental) rentalEnums.nextElement();
      result += each.getCharge();
    }
    return result;
  }

}
