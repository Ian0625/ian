package org.hx.ian.designpattern.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName Disk
 * @Author hx 2018/11/19
 * @Description TODO
 * @Date 2018/11/19 21:18
 * @Version 1.0
 */
public class Disk {

  private static final Logger LOGGER = LoggerFactory.getLogger(Disk.class);

  public void startup() {
    LOGGER.info("disk startup!");
  }

  public void shutdown() {
    LOGGER.info("disk shutdown!");
  }

}
