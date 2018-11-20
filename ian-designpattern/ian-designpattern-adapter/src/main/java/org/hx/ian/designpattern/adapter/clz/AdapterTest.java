package org.hx.ian.designpattern.adapter.clz;

/**
 * @ClassName AdapterTest
 * @Author hx 2018/11/19
 * @Description TODO
 * @Date 2018/11/19 20:43
 * @Version 1.0
 */
public class AdapterTest {

  public static void main(String[] args) {
    Targetable targetable = new Adapter();
    targetable.method1();
    targetable.method2();
  }

}
