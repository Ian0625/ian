package org.hx.ian.designpattern.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName Memory
 * @Author hx 2018/11/19
 * @Description TODO
 * @Date 2018/11/19 21:16
 * @Version 1.0
 */
public class Memory {

  private static final Logger LOGGER = LoggerFactory.getLogger(Memory.class);

  public void startup() {
    LOGGER.info("memory startup!");
  }

  public void shutdown() {
    LOGGER.info("memory shutdown!");
  }

}
