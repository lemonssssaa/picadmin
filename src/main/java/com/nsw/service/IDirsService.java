package com.nsw.service;

import com.nsw.entity.Dirs;

import java.util.List;

public interface IDirsService {
    List<Dirs> findAll();

    Integer delete(Integer dirs_id);

    Integer insert(Dirs dirs);

    Integer updata(Dirs dirs);
}
