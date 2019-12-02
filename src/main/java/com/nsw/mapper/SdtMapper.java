package com.nsw.mapper;

import com.nsw.entity.Sdu;
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
public interface SdtMapper {

    List<Sdu> fuzzySelect(String name);
    List<Sdu> selectAll();
}
