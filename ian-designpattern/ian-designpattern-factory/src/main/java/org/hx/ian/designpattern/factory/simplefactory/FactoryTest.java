package org.hx.ian.designpattern.factory.simplefactory;

import org.hx.ian.designpattern.factory.Sender;

/**
 * @ClassName FactoryTest
 * @Author hx 2018/11/19
 * @Description TODO
 * @Date 2018/11/19 16:14
 * @Version 1.0
 */
public class FactoryTest {

  public static void main(String[] args) {
    SendFactory factory = new SendFactory();
    Sender sender = factory.produce("sms");
    sender.send();
  }

}
