package org.hx.ian.designpattern.visitor;

/**
 * @ClassName Test
 * @Author hx 2018/11/28
 * @Description TODO
 * @Date 2018/11/28 09:32
 * @Version 1.0
 */
public class Test {

  public static void main(String[] args) {
    Visitor visitor = new MyVisitor();
    Subject subject = new MySubject();
    subject.accept(visitor);
  }

}
