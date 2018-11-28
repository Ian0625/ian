package org.hx.ian.designpattern.memento;

/**
 * @ClassName Test
 * @Author hx 2018/11/27
 * @Description TODO
 * @Date 2018/11/27 18:05
 * @Version 1.0
 */
public class Test {

  public static void main(String[] args) {
    Original origi = new Original("egg");

    Storage storage = new Storage(origi.createMemento());

    System.out.println("初始化状态：" + origi.getValue());
    origi.setValue("niu");
    System.out.println("修改后的状态：" + origi.getValue());

    origi.restoreMemento(storage.getMemento());
    System.out.println("恢复后的状态为：" + origi.getValue());

  }

}
