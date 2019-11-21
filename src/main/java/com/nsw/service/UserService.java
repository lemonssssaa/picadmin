package com.nsw.service;

import com.nsw.dao.UserMapper;
import com.nsw.dirs.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService{

    @Autowired
    private UserMapper userMapper;

    public int saveUser(String namee , String input) {
        return userMapper.saveUser(namee, input);
    }

}
