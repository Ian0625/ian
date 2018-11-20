package org.hx.ian.designpattern.abstractfactory;

/**
 * @ClassName Test
 * @Author hx 2018/11/19
 * @Description TODO
 * @Date 2018/11/19 18:10
 * @Version 1.0
 */
public class Test {

  public static void main(String[] args) {
    Provider provider = new SendMailFactory();
    Sender sender = provider.produce();
    sender.send();
  }

}
