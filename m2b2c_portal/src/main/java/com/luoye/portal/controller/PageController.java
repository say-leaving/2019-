package com.luoye.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/{page}")
    public String requestPage(@PathVariable String page){
        return page;
    }

    @RequestMapping("/home.html")
    public String index(){
        return "index";
    }

}
