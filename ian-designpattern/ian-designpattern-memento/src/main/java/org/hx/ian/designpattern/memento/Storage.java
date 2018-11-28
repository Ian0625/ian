package org.hx.ian.designpattern.memento;

/**
 * @ClassName Storage
 * @Author hx 2018/11/27
 * @Description TODO
 * @Date 2018/11/27 18:04
 * @Version 1.0
 */
public class Storage {

  private Memento memento;

  public Storage(Memento memento) {
    this.memento = memento;
  }

  public Memento getMemento() {
    return memento;
  }

  public void setMemento(Memento memento) {
    this.memento = memento;
  }
}
