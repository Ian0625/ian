package org.hx.ian.designpattern.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName SourceSub2
 * @Author hx 2018/11/21
 * @Description TODO
 * @Date 2018/11/21 20:48
 * @Version 1.0
 */
public class SourceSub2 implements Sourceable {

  private static final Logger LOGGER = LoggerFactory.getLogger(SourceSub2.class);

  @Override
  public void method() {
    LOGGER.info("this is the second sub!");
  }
}
