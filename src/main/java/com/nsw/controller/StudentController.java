package com.nsw.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


/**
 * @author WengQiZhi
 * @BelongsPackage springbootday
 * @date 2019-10-29 17:06
 * @Description: todo
 */
@Controller
public class StudentController {



    @RequestMapping("/Blog")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("index");

        return modelAndView;
    }

    @RequestMapping("/login")
    public String dl(){
        return "login";
    }

    @RequestMapping("/regist")
    public String aq(){
        return "regist";
    }
}
