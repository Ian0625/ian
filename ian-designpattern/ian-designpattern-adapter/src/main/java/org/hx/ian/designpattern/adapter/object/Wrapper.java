package org.hx.ian.designpattern.adapter.object;

import org.hx.ian.designpattern.adapter.Source;
import org.hx.ian.designpattern.adapter.clz.Targetable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName Wrapper
 * @Author hx 2018/11/19
 * @Description TODO
 * @Date 2018/11/19 20:45
 * @Version 1.0
 */
public class Wrapper implements Targetable {

  private static final Logger LOGGER = LoggerFactory.getLogger(Wrapper.class);

  private Source source;

  public Wrapper(Source source) {
    super();
    this.source = source;
  }

  @Override
  public void method1() {
    source.method1();
  }

  @Override
  public void method2() {
    LOGGER.info("this is the targetable method!");
  }
}
