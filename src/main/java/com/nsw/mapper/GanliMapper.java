package com.nsw.mapper;

import com.nsw.entity.Ganli;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface GanliMapper {
    @Select("select * from sys_user ")
    List<Ganli> findAll();

    @Insert(" insert into sys_user  (username) values (#{username})")
    public int save(Ganli ganli);

    @Delete(" delete from sys_user where id= #{id} ")
    public void delete(int id);

    @Select("select * from sys_user where id= #{id} ")
    public Ganli get(int id);

    @Update("update sys_user set username=#{username} where id=#{id} ")
    public int update(Ganli ganli);
}
