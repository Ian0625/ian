package org.hx.ian.designpattern.memento;

/**
 * @ClassName Original
 * @Author hx 2018/11/27
 * @Description TODO
 * @Date 2018/11/27 18:02
 * @Version 1.0
 */
public class Original {

  private String value;

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Original(String value) {
    this.value = value;
  }

  public Memento createMemento() {
    return new Memento(value);
  }

  public void restoreMemento(Memento memento) {
    this.value = memento.getValue();
  }
}
