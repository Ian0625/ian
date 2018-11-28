package org.hx.ian.designpattern.visitor;

/**
 * @ClassName MyVisitor
 * @Author hx 2018/11/28
 * @Description TODO
 * @Date 2018/11/28 09:31
 * @Version 1.0
 */
public class MyVisitor implements Visitor {

  @Override
  public void visit(Subject subject) {
    System.out.println("visit the subject: " + subject.getSubject());
  }
}
