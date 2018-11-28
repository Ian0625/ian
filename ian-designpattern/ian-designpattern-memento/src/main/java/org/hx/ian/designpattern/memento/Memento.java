package org.hx.ian.designpattern.memento;

/**
 * @ClassName Memento
 * @Author hx 2018/11/27
 * @Description TODO
 * @Date 2018/11/27 18:03
 * @Version 1.0
 */
public class Memento {

  private String value;

  public Memento(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
}
