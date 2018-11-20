package org.hx.ian.designpattern.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName Source
 * @Author hx 2018/11/19
 * @Description TODO
 * @Date 2018/11/19 20:39
 * @Version 1.0
 */
public class Source {

  private static final Logger LOGGER = LoggerFactory.getLogger(Source.class);

  public void method1() {
    LOGGER.info("this is original method!");
  }

}
