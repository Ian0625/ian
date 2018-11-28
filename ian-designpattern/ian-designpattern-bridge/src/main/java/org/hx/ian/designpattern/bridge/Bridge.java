package org.hx.ian.designpattern.bridge;

/**
 * @ClassName Bridge
 * @Author hx 2018/11/21
 * @Description TODO
 * @Date 2018/11/21 20:50
 * @Version 1.0
 */
public abstract class Bridge {

  private Sourceable source;

  public void method() {
    source.method();
  }

  public Sourceable getSource() {
    return source;
  }

  public void setSource(Sourceable source) {
    this.source = source;
  }
}
