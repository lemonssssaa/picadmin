package com.nsw.repository;


import com.nsw.dirs.Relationship;
import com.nsw.dirs.RelationshipPK;
import com.nsw.dirs.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Set;


public interface RelationshipRepository extends JpaRepository<Relationship, RelationshipPK> {

    //根据用户id查询关注的摄影师
    @Query("select r from Relationship r where r.from_user_id = ?1")
    List<Relationship> findByFromUserId(String from_user_id);

}