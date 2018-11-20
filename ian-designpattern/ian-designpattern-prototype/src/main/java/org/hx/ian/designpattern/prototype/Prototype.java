package org.hx.ian.designpattern.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @ClassName Prototype
 * @Author hx 2018/11/19
 * @Description TODO
 * @Date 2018/11/19 20:27
 * @Version 1.0
 */
public class Prototype implements Cloneable, Serializable {

  private String string;

  private SerializableObject obj;

  /**
   * 浅复制
   */
  @Override
  public Object clone() throws CloneNotSupportedException {
    Prototype proto = (Prototype) super.clone();
    return proto;
  }

  /**
   * 深复制
   */
  public Object deepClone() throws IOException, ClassNotFoundException {
    // 写入当前对象的二进制流
    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    ObjectOutputStream oos = new ObjectOutputStream(bos);
    oos.writeObject(this);

    // 读出二进制流产生的新对象
    ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
    ObjectInputStream ois = new ObjectInputStream(bis);
    return ois.readObject();
  }

  public String getString() {
    return string;
  }

  public void setString(String string) {
    this.string = string;
  }

  public SerializableObject getObj() {
    return obj;
  }

  public void setObj(SerializableObject obj) {
    this.obj = obj;
  }
}

class SerializableObject implements Serializable {

}
