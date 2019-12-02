package com.nsw.service.impl;

import com.nsw.entity.Sdu;
import com.nsw.mapper.SdtMapper;
import com.nsw.service.SdtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author WengQiZhi
 * @BelongsPackage springbootday
 * @date 2019-10-29 17:02
 * @Description: todo
 */
@Service
public class SdtServiceImpl implements SdtService {
    @Autowired
    SdtMapper sdtMapper;

    @Override
    public List<Sdu> selectAll() {
        return sdtMapper.selectAll();
    }

    @Override
    public List<Sdu> fuzzySelect(String name) {
        return sdtMapper.fuzzySelect(name);
    }


}
