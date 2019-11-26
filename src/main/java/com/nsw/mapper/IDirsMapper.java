package com.nsw.mapper;

import com.nsw.dirs.Dirs;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface IDirsMapper {

    /***/
    List<Dirs> findAll();

    Integer delete(Integer dirs_id);

    Integer insert(Dirs dirs);

    Integer updata(Dirs dirs);

}
