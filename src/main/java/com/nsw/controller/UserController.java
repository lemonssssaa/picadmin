package com.nsw.controller;

import com.nsw.dirs.Result;
import com.nsw.dirs.User;
import com.nsw.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
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

    @RequestMapping(value = "/regist")
    public Result regist(User user){
        return userService.regist(user);
    }

    /**
     * 登录
     * @param user 参数封装
     * @return Result
     */
    @RequestMapping(value = "/login")
    public Result login(User user){
        return userService.login(user);
    }

}
