package com.nsw.service;

import com.nsw.dao.Aaa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AaaService {
    @Autowired
    private Aaa aaa;

    public int saveUserr(String username , String password,String mailbox) {
        return aaa.inseraa(username, password,mailbox);
    }
}
