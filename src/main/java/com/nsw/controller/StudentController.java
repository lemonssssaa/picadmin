package com.nsw.controller;

import com.alibaba.fastjson.JSONObject;
import com.nsw.dirs.Student;
import com.nsw.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
@RequestMapping(value = "stu",produces = {"application/json;charset=UTF-8"})
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/fuzzySelect")
    public String findSelect(HttpServletRequest request) throws UnsupportedEncodingException {
        request.setCharacterEncoding("utf-8");
        String keyword=request.getParameter("keyword");
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
