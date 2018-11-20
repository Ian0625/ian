package org.hx.ian.designpattern.factory.multifactory;

import org.hx.ian.designpattern.factory.MailSender;
import org.hx.ian.designpattern.factory.Sender;
import org.hx.ian.designpattern.factory.SmsSender;

/**
 * @ClassName SendFactory
 * @Author hx 2018/11/19
 * @Description 多个工厂方法
 * @Date 2018/11/19 16:15
 * @Version 1.0
 */
public class SendFactory {

  public Sender produceMail() {
    return new MailSender();
  }

  public Sender produceSms() {
    return new SmsSender();
  }

}
