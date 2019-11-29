package com.nsw.service;

import com.nsw.entity.Student;

import java.util.List;

/**
 * @author WengQiZhi
 * @BelongsPackage springbootday
 * @date 2019-10-29 17:01
 * @Description: todo
 */
public interface StudentService {

    List<Student> fuzzySelect(String name);
}
