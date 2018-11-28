package org.hx.ian.designpattern.chain;

/**
 * @ClassName AbstractHandler
 * @Author hx 2018/11/27
 * @Description TODO
 * @Date 2018/11/27 14:02
 * @Version 1.0
 */
public abstract class AbstractHandler {

  private Handler handler;

  public Handler getHandler() {
    return handler;
  }

  public void setHandler(Handler handler) {
    this.handler = handler;
  }
}
