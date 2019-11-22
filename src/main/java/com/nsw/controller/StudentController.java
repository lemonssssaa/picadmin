package com.nsw.controller;

import com.alibaba.fastjson.JSONObject;
import com.nsw.dirs.Student;
import com.nsw.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
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
    @GetMapping("/findSjk")
    public String findSjk(){
        return JSONObject.toJSONString(studentService.findSjk()) ;

    }
    @GetMapping("/findselect")
    public String findSelect(HttpServletRequest request) throws UnsupportedEncodingException {
        request.setCharacterEncoding("utf-8");
        String keyword=request.getParameter("keyword");
        List<Student> list=studentService.findSelect(keyword);
        return JSONObject.toJSONString(list);
    }

}
