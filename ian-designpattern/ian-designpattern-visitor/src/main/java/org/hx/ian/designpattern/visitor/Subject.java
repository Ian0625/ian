package org.hx.ian.designpattern.visitor;

/**
 * @ClassName Subject
 * @Author hx 2018/11/28
 * @Description TODO
 * @Date 2018/11/28 09:28
 * @Version 1.0
 */
public interface Subject {

  void accept(Visitor visitor);

  String getSubject();

}
