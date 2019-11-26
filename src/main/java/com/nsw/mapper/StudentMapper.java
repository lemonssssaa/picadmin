package com.nsw.mapper;

import com.nsw.dirs.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author WengQiZhi
 * @BelongsPackage springbootday
 * @date 2019-10-29 16:57
 * @Description: todo
 */
@Repository
@Mapper
public interface StudentMapper {

    List<Student> findSelect(String name);

}
