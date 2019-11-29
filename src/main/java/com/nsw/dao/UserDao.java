package com.nsw.dao;

import com.nsw.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


/**
 * @author Lizhiyuan
 * @BelongsPackage springbootstw
 * @date 2019-11-26 12:07
 * @Description: todo
 */

@Component
@Mapper
public interface UserDao {

    /*
    * 注册
    * @param user
    * */
     void insert(User user);

     /*
     * 根据数据码查询用户
     * @param activeCode
     * @return
     * */
     User selectUserByActiveCode(String activeCode);

     /*
     * 更新用户
     * @param user
     * @return
     * */
     void update(User user);

     /*
     * 查询用户
     * @param user
     * @return
     * */
     User select(User user);
}
