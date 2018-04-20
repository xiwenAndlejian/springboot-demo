package com.otakus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 作者：ganxiang <br>
 * 时间：2018年04月20日 22:16<br>
 * 标题：Controller<br>
 * 功能：控制器<br>
 */
@Controller
public class DemoController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
