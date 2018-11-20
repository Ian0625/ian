package org.hx.ian.designpattern.singleton;

/**
 * @ClassName Singleton
 * @Author hx 2018/11/19
 * @Description TODO
 * @Date 2018/11/19 18:13
 * @Version 1.0
 */
public class Singleton {

  /**
   * 私有构造方法，防止被实例化
   */
  private Singleton() {
  }

  /**
   * 此处使用一个内部类来维护单例
   */
  private static class SingletonFactory {

    /**
     * 持有私有静态实例，防止被引用，此处赋值null，目的是实现延迟加载
     */
    private static Singleton instance = new Singleton();
  }

  /**
   * 获取实例
   */
  public static Singleton getInstance() {
    return SingletonFactory.instance;
  }

  /**
   * 如果该对象被用于序列化，可以保证对象在序列化前后保持一致
   */
  public Object readResolve() {
    return getInstance();
  }

}
