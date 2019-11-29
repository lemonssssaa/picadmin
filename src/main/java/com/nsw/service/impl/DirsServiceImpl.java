package com.nsw.service.impl;

import com.nsw.mapper.IDirsMapper;
import com.nsw.entity.Dirs;
import com.nsw.service.IDirsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DirsServiceImpl implements IDirsService {

    @Autowired
    private IDirsMapper iDirsMapper;

    @Override
    public List<Dirs> findAll() {
        return iDirsMapper.findAll();
    }

    @Override
    public Integer delete(Integer dirs_id) {
        return iDirsMapper.delete(dirs_id);
    }

    @Override
    public Integer insert(Dirs dirs) {
        return iDirsMapper.insert(dirs);
    }

    @Override
    public Integer updata(Dirs dirs) {
        return iDirsMapper.updata(dirs);
    }
}
