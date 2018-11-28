package org.hx.ian.designpattern.bridge;

/**
 * @ClassName BridgeTest
 * @Author hx 2018/11/21
 * @Description TODO
 * @Date 2018/11/21 20:53
 * @Version 1.0
 */
public class BridgeTest {

  public static void main(String[] args) {
    Bridge bridge = new MyBridge();

    // 调用第一个对象
    Sourceable source1 = new SourceSub1();
    bridge.setSource(source1);
    bridge.method();

    // 调用第二个对象
    Sourceable source2 = new SourceSub2();
    bridge.setSource(source2);
    bridge.method();
  }

}
