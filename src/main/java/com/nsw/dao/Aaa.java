package com.nsw.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Aaa {
    @Insert({"insert into usertable (username,password,mailbox)" +
            " values (#{username},#{password},#{mailbox})"})
    public int inseraa(@Param("username") String username, @Param("password") String password,
                       @Param("mailbox") String mailbox);
}
