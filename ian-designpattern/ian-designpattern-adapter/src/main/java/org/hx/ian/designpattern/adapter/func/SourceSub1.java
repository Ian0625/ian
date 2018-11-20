package org.hx.ian.designpattern.adapter.func;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName SourceSub1
 * @Author hx 2018/11/19
 * @Description TODO
 * @Date 2018/11/19 20:53
 * @Version 1.0
 */
public class SourceSub1 extends Wrapper {

  private static final Logger LOGGER = LoggerFactory.getLogger(SourceSub1.class);

  @Override
  public void method1() {
    LOGGER.info("the sourceable interface's first Sub1!");
  }
}
