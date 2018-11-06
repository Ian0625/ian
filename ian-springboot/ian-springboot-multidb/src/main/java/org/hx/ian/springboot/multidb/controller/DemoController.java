package org.hx.ian.springboot.multidb.controller;

import org.hx.ian.springboot.multidb.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName DemoController
 * @Author hx 2018/11/6
 * @Description demo 控制器
 * @Date 2018/11/6 09:18
 * @Version 1.0
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "/string", method = RequestMethod.GET)
    public String getString() {
        return demoService.getDemo();
    }
}
