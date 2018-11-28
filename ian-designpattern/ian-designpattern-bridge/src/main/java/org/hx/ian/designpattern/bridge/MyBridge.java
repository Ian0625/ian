package org.hx.ian.designpattern.bridge;

/**
 * @ClassName MyBridge
 * @Author hx 2018/11/21
 * @Description TODO
 * @Date 2018/11/21 20:52
 * @Version 1.0
 */
public class MyBridge extends Bridge {

  @Override
  public void method() {
    getSource().method();
  }

}
