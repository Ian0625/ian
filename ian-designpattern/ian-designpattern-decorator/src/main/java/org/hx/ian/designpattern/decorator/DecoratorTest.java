package org.hx.ian.designpattern.decorator;

/**
 * @ClassName DecoratorTest
 * @Author hx 2018/11/19
 * @Description TODO
 * @Date 2018/11/19 21:04
 * @Version 1.0
 */
public class DecoratorTest {

  public static void main(String[] args) {
    Sourceable source = new Source();
    Sourceable obj = new Decorator(source);
    obj.method();

  }

}
