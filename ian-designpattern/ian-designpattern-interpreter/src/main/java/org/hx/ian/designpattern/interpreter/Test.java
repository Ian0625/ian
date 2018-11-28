package org.hx.ian.designpattern.interpreter;

/**
 * @ClassName Test
 * @Author hx 2018/11/28
 * @Description TODO
 * @Date 2018/11/28 09:46
 * @Version 1.0
 */
public class Test {

  public static void main(String[] args) {
    int result = new Minus().interpret((new Context(new Plus().interpret(new Context(9, 2)), 8)));
    System.out.println(result);
  }

}
