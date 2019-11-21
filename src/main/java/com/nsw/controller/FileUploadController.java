package com.nsw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FileUploadController {

    @RequestMapping("/file")
    public String file(){
        System.out.print("================请求路径===跳转file页面====="+"\n");
        return "/file";
    }

    @RequestMapping("/index")
    public String index(){
        System.out.print("================请求路径===跳转index页面====="+"\n");
        return "/upload";
    }

    @RequestMapping("/edit")
    public String edit(){
        System.out.println("================请求路径===跳转edit页面====="+"\n");
        return "/edit";
    }
}