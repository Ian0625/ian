package org.hx.ian.designpattern.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName Computer
 * @Author hx 2018/11/19
 * @Description TODO
 * @Date 2018/11/19 21:19
 * @Version 1.0
 */
public class Computer {

  private static final Logger LOGGER = LoggerFactory.getLogger(Computer.class);

  private CPU cpu;

  private Memory memory;

  private Disk disk;

  public Computer() {
    this.cpu = new CPU();
    this.memory = new Memory();
    this.disk = new Disk();
  }

  public void startup() {
    LOGGER.info("start the computer!");
    cpu.startup();
    memory.startup();
    disk.startup();
    LOGGER.info("start the computer finished!");
  }

  public void shutdown() {
    LOGGER.info("begin to close the computer!");
    cpu.shutdown();
    memory.shutdown();
    disk.shutdown();
    LOGGER.info("computer closed!");
  }
}
