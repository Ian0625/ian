package org.hx.ian.designpattern.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName Proxy
 * @Author hx 2018/11/19
 * @Description TODO
 * @Date 2018/11/19 21:08
 * @Version 1.0
 */
public class Proxy implements Sourceable {

  private static final Logger LOGGER = LoggerFactory.getLogger(Proxy.class);

  private Source source;

  public Proxy() {
    super();
    this.source = new Source();
  }

  @Override
  public void method() {
    before();
    source.method();
    after();
  }

  private void after() {
    LOGGER.info("after proxy!");
  }

  private void before() {
    LOGGER.info("before proxy!");
  }
}
