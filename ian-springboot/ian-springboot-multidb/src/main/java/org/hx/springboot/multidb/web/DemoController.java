package org.hx.springboot.multidb.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hx 2018/10/27
 * @desc
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Value("${abc}")
    private String abc;

    @Value("${cde}")
    private String cde;

    @RequestMapping(value = "/string")
    public String getString() {
        String result = abc + cde;
        return result;
    }
}
