package com.nsw.controller;

import com.nsw.common.IDUtils;
import com.nsw.entity.User;
import com.nsw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.nsw.service.impl.UppicService;
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private UppicService uppicService;
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    @ResponseBody
    public String add(@RequestParam("namee") String namee,
                      @RequestParam("input") String input) {
        System.out.println("开始添加数据==========");
        int end = uppicService.saveUser(namee, input);
        if (namee.isEmpty()) {
            return "上传作品名称不可为空";
        } else if (input.isEmpty()) {
            return "上传名称不可为空";
        } else {
            return "上传成功，name===作品名称是" + namee + "\n" +
                    "上传名称是,input===上传名称是" + input;
        }
    }

    /*
     * 注册
     * @param user
     * @return
     * */
    @RequestMapping(value = "/register")
    public String register(User user){
        user.setActiveStatus(0);
        String activeCode = IDUtils.getUUID();
        user.setActiveCode(activeCode);
        userService.add(user);

        return "success";
    }

    /*
     * 效验激活码
     * @param code
     * @return
     * */
    @RequestMapping(value = "/checkCode")
    public String checkCode(String code){
        User user = userService.getUserByActiveCode(code);
        //如果用户不等于null,把用户状态修改status=1
        if (user != null){
            user.setActiveStatus(1);
            //把code验证码清空，已经不需要了
            user.setActiveCode("");
            userService.modify(user);

            return "activeSuccess";
        }
        return "login";
    }

    /*
     * 登录
     * @return login
     * */
    @RequestMapping(value = "/loginPage")
    public String login(){
        return "login";
    }

    /*
     * 登录
     * */
    @RequestMapping(value = "/login")
    public String login(User user, Model model){
        User u = userService.get(user);
        if (u != null){
            return "welcome";
        }
        return "error";
    }

}
