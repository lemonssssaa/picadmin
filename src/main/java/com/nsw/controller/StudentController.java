package com.nsw.controller;

import com.alibaba.fastjson.JSONObject;
import com.nsw.dirs.Student;
import com.nsw.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author WengQiZhi
 * @BelongsPackage springbootday
 * @date 2019-10-29 17:06
 * @Description: todo
 */
@RestController
@RequestMapping("sdu")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/fuzzySelect")
    @ResponseBody
    public String findSelect(@RequestParam("keyword")String keyword ){
        String searChe = keyword.replaceAll("%","").replaceAll(" ","")
                .replaceAll("_","");
        List<Student> list=null;
        if(!StringUtils.isEmpty(searChe)){
            list =studentService.fuzzySelect(keyword);
        }else {
            list = new ArrayList<>();
        }
        return JSONObject.toJSONString(list);
    }

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
