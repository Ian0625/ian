package org.hx.ian.designpattern.chain;

/**
 * @ClassName MyHandler
 * @Author hx 2018/11/27
 * @Description TODO
 * @Date 2018/11/27 14:03
 * @Version 1.0
 */
public class MyHandler extends AbstractHandler implements Handler {

  private String name;

  public MyHandler(String name) {
    this.name = name;
  }

  @Override
  public void operator() {
    System.out.println(name + " deal!");
    if (getHandler() != null) {
      getHandler().operator();
    }
  }
}
