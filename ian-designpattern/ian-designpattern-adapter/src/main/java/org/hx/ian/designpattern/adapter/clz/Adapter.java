package org.hx.ian.designpattern.adapter.clz;

import org.hx.ian.designpattern.adapter.Source;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName Adapter
 * @Author hx 2018/11/19
 * @Description TODO
 * @Date 2018/11/19 20:42
 * @Version 1.0
 */
public class Adapter extends Source implements Targetable {

  private static final Logger LOGGER = LoggerFactory.getLogger(Adapter.class);

  @Override
  public void method2() {
    LOGGER.info("this is the targetable method!");
  }
}
