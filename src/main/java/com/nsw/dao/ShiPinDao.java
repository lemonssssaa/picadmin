package com.nsw.dao;

import com.nsw.entity.Shipin;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface ShiPinDao {
    //插入
    @Insert({"insert into shipins (name,lujing,url)" +
            " values (#{name},#{lujing},#{url})"})
    public int insertUrl(@Param("name") String name, @Param("lujing") String lujing,
                         @Param("url") String url);

    //查询
    @Select("select * from shipins")
    public List<Shipin> selectShipin();

    //修改
    @Update("UPDATE `test`.`shipins` SET" +
            " `zhuanji` = #{zhuanji} WHERE `id` = #{id};")
    int update(Shipin shipin);
}
