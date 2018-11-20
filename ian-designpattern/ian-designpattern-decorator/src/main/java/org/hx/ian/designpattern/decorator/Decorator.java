package org.hx.ian.designpattern.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName Decorator
 * @Author hx 2018/11/19
 * @Description TODO
 * @Date 2018/11/19 21:03
 * @Version 1.0
 */
public class Decorator implements Sourceable {

  private static final Logger LOGGER = LoggerFactory.getLogger(Decorator.class);

  private Sourceable sourceable;

  public Decorator(Sourceable sourceable) {
    this.sourceable = sourceable;
  }

  @Override
  public void method() {
    LOGGER.info("before decorator!");
    sourceable.method();
    LOGGER.info("after decorator!");
  }
}
