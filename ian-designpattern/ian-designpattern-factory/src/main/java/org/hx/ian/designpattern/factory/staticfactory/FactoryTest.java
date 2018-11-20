package org.hx.ian.designpattern.factory.staticfactory;

import org.hx.ian.designpattern.factory.Sender;

/**
 * @ClassName FactoryTest
 * @Author hx 2018/11/19
 * @Description TODO
 * @Date 2018/11/19 16:19
 * @Version 1.0
 */
public class FactoryTest {

  public static void main(String[] args) {
    Sender sender = SendFactory.produceMail();
    sender.send();
  }

}
