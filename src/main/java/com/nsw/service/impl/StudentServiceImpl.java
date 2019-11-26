package com.nsw.service.impl;

import com.nsw.dirs.Student;
import com.nsw.mapper.StudentMapper;
import com.nsw.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
