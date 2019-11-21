package com.nsw.repository;

//import com.springboot.store.entity.Relationship;
import com.nsw.dirs.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String> {

    List<User> findByEmail(String user_email);

    @Query(value = "select user_password from user where email = ?", nativeQuery = true)
    String getUserPaswordByEmail(String user_email);

    @Query(value = "select user_password from user where username = ?", nativeQuery = true)
    String getUserPasswordByUser_id(String username);

    //根据用户id查询用户
    @Query("select u from User u where u.user_id=?1")
    User findByUser(String user_id);

}
