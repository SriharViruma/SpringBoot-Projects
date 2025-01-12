package com.spring.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class IndexController {
    @RequestMapping("/")
    @ResponseBody
    public String index(){
        return "<h1>Welcome to SpringBoot 6</h1>";
    }
}
