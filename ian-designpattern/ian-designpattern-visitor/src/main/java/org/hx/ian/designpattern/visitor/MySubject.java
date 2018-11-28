package org.hx.ian.designpattern.visitor;

/**
 * @ClassName MySubject
 * @Author hx 2018/11/28
 * @Description TODO
 * @Date 2018/11/28 09:31
 * @Version 1.0
 */
public class MySubject implements Subject {

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  @Override
  public String getSubject() {
    return "Love";
  }
}
