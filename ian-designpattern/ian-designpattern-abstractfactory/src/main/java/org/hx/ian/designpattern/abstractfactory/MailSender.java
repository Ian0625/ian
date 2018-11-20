package org.hx.ian.designpattern.abstractfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName MailSender
 * @Author hx 2018/11/19
 * @Description TODO
 * @Date 2018/11/19 17:43
 * @Version 1.0
 */
public class MailSender implements Sender {

  private static final Logger LOGGER = LoggerFactory.getLogger(MailSender.class);

  @Override
  public void send() {
    LOGGER.info("this is mailSender!");
  }
}
