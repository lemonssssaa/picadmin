package com.nsw.service;

import com.nsw.entity.Sdu;

import java.util.List;

/**
 * @author WengQiZhi
 * @BelongsPackage springbootday
 * @date 2019-10-29 17:01
 * @Description: todo
 */
public interface SdtService {

    List<Sdu> fuzzySelect(String name);

    List<Sdu> selectAll();
}
