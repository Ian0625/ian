package org.hx.ian.designpattern.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName Source
 * @Author hx 2018/11/19
 * @Description TODO
 * @Date 2018/11/19 21:01
 * @Version 1.0
 */
public class Source implements Sourceable {

  private static final Logger LOGGER = LoggerFactory.getLogger(Source.class);

  @Override
  public void method() {
    LOGGER.info("the original method!");
  }
}
