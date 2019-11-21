package com.nsw.repository;

import com.nsw.dirs.Album;
import com.nsw.dirs.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AlbumRepository extends JpaRepository<Album, String> {

    //查询用户的专辑并按时间排序
    @Query("select a from Album a where a.user = ?1 order by a.comment_time desc")
    List<Album> findByUser(User user);


}
