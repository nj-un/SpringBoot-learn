package com.gx.springbootfreemarker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: gaoxu
 * @date: 2018/8/30
 */
@Controller
@RequestMapping
public class TestController {

    @RequestMapping("/index")
    public ModelAndView userList() {
        ModelAndView modelAndView = new ModelAndView("/index");

        return modelAndView;
    }
}
