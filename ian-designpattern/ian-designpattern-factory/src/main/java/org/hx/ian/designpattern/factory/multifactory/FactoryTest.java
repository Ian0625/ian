package org.hx.ian.designpattern.factory.multifactory;

import org.hx.ian.designpattern.factory.Sender;

/**
 * @ClassName FactoryTest
 * @Author hx 2018/11/19
 * @Description TODO
 * @Date 2018/11/19 16:17
 * @Version 1.0
 */
public class FactoryTest {

  public static void main(String[] args) {
    SendFactory sendFactory = new SendFactory();
    Sender sender = sendFactory.produceMail();
    sender.send();
  }

}
