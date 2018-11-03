package org.hx.ian.thread.ch01;

import java.util.Date;

/**
 * @ClassName SimpleJavaApp
 * @Author hx 2018/11/2
 * @Description TODO
 * @Date 2018/11/2 11:44
 * @Version 1.0
 */
public class SimpleJavaApp {

    public static void main(String[] args) throws Exception {
        while (true) {
            System.out.println(new Date());
            Thread.sleep(1000);
        }
    }

}
