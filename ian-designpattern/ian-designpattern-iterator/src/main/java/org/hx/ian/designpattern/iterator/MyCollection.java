package org.hx.ian.designpattern.iterator;

/**
 * @ClassName MyCollection
 * @Author hx 2018/11/27
 * @Description TODO
 * @Date 2018/11/27 11:39
 * @Version 1.0
 */
public class MyCollection implements Collection {

  public String string[] = {"A", "B", "C", "D", "E"};

  @Override
  public Iterator iterator() {
    return new MyIterator(this);
  }

  @Override
  public Object get(int i) {
    return string[i];
  }

  @Override
  public int size() {
    return string.length;
  }
}
