package com.nsw.service.impl;

import com.nsw.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UppicService {

    @Autowired
    private UserMapper userMapper;

    public int saveUser(String namee , String input) {
        return userMapper.saveUser(namee, input);
    }



}
