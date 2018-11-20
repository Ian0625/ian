package org.hx.ian.designpattern.adapter.func;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName SourceSub2
 * @Author hx 2018/11/19
 * @Description TODO
 * @Date 2018/11/19 20:54
 * @Version 1.0
 */
public class SourceSub2 extends Wrapper {

  private static final Logger LOGGER = LoggerFactory.getLogger(SourceSub2.class);

  @Override
  public void method2() {
    LOGGER.info("the sourceable interface's second Sub2!");
  }
}
