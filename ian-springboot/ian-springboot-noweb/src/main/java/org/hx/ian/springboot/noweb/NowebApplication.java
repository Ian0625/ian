package org.hx.ian.springboot.noweb;

import java.util.Date;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName NowebApplication
 * @Author hx 2018/11/19
 * @Description TODO
 * @Date 2018/11/19 14:45
 * @Version 1.0
 */
@SpringBootApplication
public class NowebApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(NowebApplication.class, args);
  }

  @Override
  public void run(String... strings) throws Exception {
    while (true) {
      System.out.println("线程一直在跑。。。" + new Date());
      Thread.sleep(3000);
    }
  }
}
