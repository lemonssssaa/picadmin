package com.nsw.mapper;

import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {

    @Insert ({"insert into user (namee,input)" +
            " values (#{namee},#{input})"})
    int saveUser(@Param("namee") String namee,
                 @Param("input") String input);




}
