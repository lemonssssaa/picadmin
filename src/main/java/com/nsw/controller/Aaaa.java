package com.nsw.controller;

import com.nsw.service.AaaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Aaaa {
    @Autowired
    private AaaService aaa;
    @PostMapping("tijiao")
    @ResponseBody
    public String aa(@RequestParam("username") String username,
                     @RequestParam("password") String password,
                     @RequestParam("mailbox") String mailbox){
        int a=aaa.saveUserr(username,password,mailbox);
        return null;
    }
}
