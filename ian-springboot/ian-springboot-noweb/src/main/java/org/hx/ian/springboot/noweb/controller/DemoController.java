package org.hx.ian.springboot.noweb.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName DemoController
 * @Author hx 2018/11/19
 * @Description TODO
 * @Date 2018/11/19 15:02
 * @Version 1.0
 */
@RestController
public class DemoController {

  @RequestMapping(value = "/demo")
  public String getDemoStr() {
    String format = "yyyy-MM-dd HH:mm:ss";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
    String date = simpleDateFormat.format(new Date());
    return date;
  }

}
