package org.hx.ian.designpattern.iterator;

/**
 * @ClassName Test
 * @Author hx 2018/11/27
 * @Description TODO
 * @Date 2018/11/27 13:59
 * @Version 1.0
 */
public class Test {

  public static void main(String[] args) {
    Collection collection = new MyCollection();
    Iterator it = collection.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }

}
