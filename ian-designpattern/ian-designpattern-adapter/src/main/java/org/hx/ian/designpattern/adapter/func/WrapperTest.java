package org.hx.ian.designpattern.adapter.func;

/**
 * @ClassName WrapperTest
 * @Author hx 2018/11/19
 * @Description TODO
 * @Date 2018/11/19 20:58
 * @Version 1.0
 */
public class WrapperTest {

  public static void main(String[] args) {
    Sourceable source1 = new SourceSub1();
    Sourceable source2 = new SourceSub2();

    source1.method1();
    source1.method2();
    source2.method1();
    source2.method2();
  }

}
