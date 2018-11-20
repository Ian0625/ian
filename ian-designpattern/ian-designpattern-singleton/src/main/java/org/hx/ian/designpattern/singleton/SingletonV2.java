package org.hx.ian.designpattern.singleton;

import java.util.Vector;

/**
 * @ClassName SingletonV2
 * @Author hx 2018/11/19
 * @Description TODO
 * @Date 2018/11/19 20:13
 * @Version 1.0
 */
public class SingletonV2 {

  private static SingletonV2 instance = null;

  private Vector properties = null;

  public Vector getProperties() {
    return properties;
  }

  private SingletonV2() {

  }

  private static synchronized void syncInit() {
    if (instance == null) {
      instance = new SingletonV2();
    }
  }

  private static SingletonV2 getInstance() {
    if (instance == null) {
      syncInit();
    }
    return instance;
  }

  public void updateProperties() {
    SingletonV2 shadow = new SingletonV2();
    properties = shadow.getProperties();
  }

}
