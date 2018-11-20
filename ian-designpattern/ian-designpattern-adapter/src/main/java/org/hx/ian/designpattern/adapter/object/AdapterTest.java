package org.hx.ian.designpattern.adapter.object;

import org.hx.ian.designpattern.adapter.Source;
import org.hx.ian.designpattern.adapter.clz.Targetable;

/**
 * @ClassName AdapterTest
 * @Author hx 2018/11/19
 * @Description TODO
 * @Date 2018/11/19 20:49
 * @Version 1.0
 */
public class AdapterTest {

  public static void main(String[] args) {
    Source source = new Source();
    Targetable targetable = new Wrapper(source);
    targetable.method1();
    targetable.method2();
  }

}
