package com.nsw.maper;

import com.nsw.dirs.Student;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author WengQiZhi
 * @BelongsPackage springbootday
 * @date 2019-10-29 16:57
 * @Description: todo
 */
@Repository
public interface StudentMapper {
    List<Student> findSjk();

    List<Student> findSelect(String name);

}