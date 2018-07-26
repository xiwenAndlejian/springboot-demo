package com.otakus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author gx
 */
@Controller
public class DemoController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        System.out.println("控制层代码执行>>>>>>>>");
        return "hello";
    }
}
