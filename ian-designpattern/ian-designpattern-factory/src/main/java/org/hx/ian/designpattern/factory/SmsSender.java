package org.hx.ian.designpattern.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName SmsSender
 * @Author hx 2018/11/19
 * @Description Sms 发送者实现者
 * @Date 2018/11/19 16:10
 * @Version 1.0
 */
public class SmsSender implements Sender {

  private static final Logger LOGGER = LoggerFactory.getLogger(SmsSender.class);

  @Override
  public void send() {
    LOGGER.info("this is sms sender");
  }
}
