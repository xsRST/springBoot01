package com.xs.controller;

import org.apache.commons.logging.LogFactory;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

@Controller
public class UserController{

    @ResponseBody
    @RequestMapping("hello")
    public String hello(){
        return "hell springBoot";
    }

    @RequestMapping("index")
    public String index(Model model){
        model.addAttribute("user","zhangsan");
        return "index";
    }

}
