package org.hx.ian.designpattern.factory.staticfactory;

import org.hx.ian.designpattern.factory.MailSender;
import org.hx.ian.designpattern.factory.Sender;
import org.hx.ian.designpattern.factory.SmsSender;

/**
 * @ClassName SendFactory
 * @Author hx 2018/11/19
 * @Description TODO
 * @Date 2018/11/19 16:19
 * @Version 1.0
 */
public class SendFactory {

  public static Sender produceMail() {
    return new MailSender();
  }

  public static Sender produceSms() {
    return new SmsSender();
  }

}
