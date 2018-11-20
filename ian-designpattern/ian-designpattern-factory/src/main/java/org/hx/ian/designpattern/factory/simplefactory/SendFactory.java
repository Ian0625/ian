package org.hx.ian.designpattern.factory.simplefactory;

import org.hx.ian.designpattern.factory.MailSender;
import org.hx.ian.designpattern.factory.Sender;
import org.hx.ian.designpattern.factory.SmsSender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName SendFactory
 * @Author hx 2018/11/19
 * @Description 发送普通工厂
 * @Date 2018/11/19 16:12
 * @Version 1.0
 */
public class SendFactory {

  private static final Logger LOGGER = LoggerFactory.getLogger(SendFactory.class);

  public Sender produce(String type) {
    if ("mail".equals(type)) {
      return new MailSender();
    } else if ("sms".equals(type)) {
      return new SmsSender();
    } else {
      LOGGER.info("请输入正确的类型！");
      return null;
    }
  }

}
