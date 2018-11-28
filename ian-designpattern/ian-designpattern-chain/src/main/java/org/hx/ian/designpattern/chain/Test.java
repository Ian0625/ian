package org.hx.ian.designpattern.chain;

/**
 * @ClassName Test
 * @Author hx 2018/11/27
 * @Description TODO
 * @Date 2018/11/27 14:04
 * @Version 1.0
 */
public class Test {

  public static void main(String[] args) {
    MyHandler h1 = new MyHandler("h1");
    MyHandler h2 = new MyHandler("h2");
    MyHandler h3 = new MyHandler("h3");

    h1.setHandler(h2);
    h2.setHandler(h3);

    h1.operator();
  }

}
