package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Kelly on 2018/11/22.
 */
@Controller
public class Controllers {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index() {
        return "index";
    }
    @RequestMapping(value="nice",method = RequestMethod.GET)
    public  String nice(Model model){
        model.addAttribute("result","hahaha 第一个参数");
        return "nice";
    }

}
