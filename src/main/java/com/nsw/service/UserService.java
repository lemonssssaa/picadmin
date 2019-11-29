package com.nsw.service;

import com.nsw.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author Lizhiyuan
 * @BelongsPackage springbootstw
 * @date 2019-11-26 12:08
 * @Description: todo
 */
public interface UserService {

    /*
    * 用户注册
    * @param user
    * */
    void add(User user);

    /*
    * 根据激活码查找用户
    * @param activeCode
    * @return
    * */
    User getUserByActiveCode(String activeCode);

    /*
    * 修改
    * @param user
    * */
    void modify(User user);

    /*
    * 登录
    * @param user
    * @return
    * */
    User get(User user);
}
