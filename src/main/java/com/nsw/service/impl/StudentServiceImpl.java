package com.nsw.service.impl;

import com.nsw.dirs.Student;
import com.nsw.maper.StudentMapper;
import com.nsw.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.ServletContextAttributeFactoryBean;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author WengQiZhi
 * @BelongsPackage springbootday
 * @date 2019-10-29 17:02
 * @Description: todo
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper studentMapper;


    @Override
    public List<Student> findSelect(String name) {
        return studentMapper.findSelect(name);
    }


}
