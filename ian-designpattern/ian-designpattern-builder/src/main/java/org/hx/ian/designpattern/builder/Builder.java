package org.hx.ian.designpattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Builder
 * @Author hx 2018/11/19
 * @Description TODO
 * @Date 2018/11/19 20:21
 * @Version 1.0
 */
public class Builder {

  private List<Sender> list = new ArrayList<Sender>();

  public void produceMailSender(int count) {
    for (int i = 0; i < count; i++) {
      list.add(new MailSender());
    }
  }

  public void produceSmsSender(int count) {
    for (int i = 0; i < count; i++) {
      list.add(new SmsSender());
    }
  }

}
