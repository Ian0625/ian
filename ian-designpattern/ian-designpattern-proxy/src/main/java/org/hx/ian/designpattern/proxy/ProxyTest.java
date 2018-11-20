package org.hx.ian.designpattern.proxy;

/**
 * @ClassName ProxyTest
 * @Author hx 2018/11/19
 * @Description TODO
 * @Date 2018/11/19 21:11
 * @Version 1.0
 */
public class ProxyTest {

  public static void main(String[] args) {
    Sourceable sourceable = new Proxy();
    sourceable.method();
  }

}
