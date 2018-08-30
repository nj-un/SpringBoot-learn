package com.gx.springbootjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author: gaoxu
 * @date: 2018/8/30
 */
@Controller
@RequestMapping
public class TestController {

    // 必须用sping-boot:run启动
    @RequestMapping("/index")
    public ModelAndView userList() {
        ModelAndView modelAndView = new ModelAndView("index");

        return modelAndView;
    }
}
