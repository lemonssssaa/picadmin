package com.nsw.service;

import com.nsw.dirs.Student;

import java.util.List;
import java.util.Map;

/**
 * @author WengQiZhi
 * @BelongsPackage springbootday
 * @date 2019-10-29 17:01
 * @Description: todo
 */
public interface StudentService {

    List<Student> fuzzySelect(String name);
}
