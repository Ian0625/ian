package org.hx.ian.designpattern.abstractfactory;

/**
 * @ClassName SendSmsFactory
 * @Author hx 2018/11/19
 * @Description TODO
 * @Date 2018/11/19 18:10
 * @Version 1.0
 */
public class SendSmsFactory implements Provider {

  @Override
  public Sender produce() {
    return new SmsSender();
  }
}
