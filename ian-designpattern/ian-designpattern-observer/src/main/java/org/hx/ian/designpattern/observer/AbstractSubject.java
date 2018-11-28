package org.hx.ian.designpattern.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @ClassName AbstractSubject
 * @Author hx 2018/11/27
 * @Description TODO
 * @Date 2018/11/27 11:23
 * @Version 1.0
 */
public abstract class AbstractSubject implements Subject {

  private Vector<Observer> observers = new Vector<>();

  @Override
  public void add(Observer observer) {
    observers.add(observer);
  }

  @Override
  public void del(Observer observer) {
    observers.remove(observer);
  }

  @Override
  public void notifyObservers() {
    Enumeration<Observer> enums = observers.elements();
    while (enums.hasMoreElements()) {
      enums.nextElement().update();
    }
  }
}
