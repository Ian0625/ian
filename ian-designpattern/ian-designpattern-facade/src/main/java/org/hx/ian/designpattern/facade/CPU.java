package org.hx.ian.designpattern.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName CPU
 * @Author hx 2018/11/19
 * @Description TODO
 * @Date 2018/11/19 21:14
 * @Version 1.0
 */
public class CPU {

  private static final Logger LOGGER = LoggerFactory.getLogger(CPU.class);

  public void startup() {
    LOGGER.info("cpu startup!");
  }

  public void shutdown() {
    LOGGER.info("cpu shutdown!");
  }
}
