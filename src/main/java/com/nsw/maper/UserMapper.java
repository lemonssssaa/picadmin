package com.nsw.maper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    @Insert ({"insert into user (namee,input)" +
            " values (#{namee},#{input})"})
    int saveUser(@Param("namee") String namee,
                 @Param("input") String input);
}
