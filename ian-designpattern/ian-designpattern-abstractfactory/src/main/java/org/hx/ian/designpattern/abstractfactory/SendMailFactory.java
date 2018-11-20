package org.hx.ian.designpattern.abstractfactory;

/**
 * @ClassName SendMailFactory
 * @Author hx 2018/11/19
 * @Description TODO
 * @Date 2018/11/19 18:08
 * @Version 1.0
 */
public class SendMailFactory implements Provider {

  @Override
  public Sender produce() {
    return new MailSender();
  }
}
