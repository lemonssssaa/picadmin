package com.nsw.controller;

import com.nsw.dirs.User;
import com.nsw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    @ResponseBody
    public String add(@RequestParam("namee") String namee,
                      @RequestParam("input") String input) {
        System.out.println("开始添加数据==========");
        int end = userService.saveUser(namee, input);
        if (namee.isEmpty()) {
            return "上传作品名称不可为空";
        } else if (input.isEmpty()) {
            return "上传名称不可为空";
        } else {
            return "上传成功，name===作品名称是" + namee + "\n" +
                    "上传名称是,input===上传名称是" + input;
        }
    }
}
