package org.hx.ian.designpattern.abstractfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName SmsSender
 * @Author hx 2018/11/19
 * @Description TODO
 * @Date 2018/11/19 18:07
 * @Version 1.0
 */
public class SmsSender implements Sender {

  private static final Logger LOGGER = LoggerFactory.getLogger(SmsSender.class);

  @Override
  public void send() {
    LOGGER.info("this is sms sender");
  }
}
