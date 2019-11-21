package com.nsw.dao;

import com.nsw.dirs.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {

    @Insert ({"insert into user (namee,input)" +
            " values (#{namee},#{input})"})
    int saveUser(@Param("namee") String namee,
                 @Param("input") String input);
}
