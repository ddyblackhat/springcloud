package com.dudy.cn.eurekaclient.business.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class DemoController {

    @RequestMapping("/hello")
    public String home() {
        return "hellos";
    }
}
