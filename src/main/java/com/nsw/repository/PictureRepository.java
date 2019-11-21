package com.nsw.repository;

import com.nsw.dirs.Album;
import com.nsw.dirs.Picture;
import com.nsw.dirs.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Set;

public interface PictureRepository extends JpaRepository<Picture, String> {

    //查询专辑内的图片
    @Query("select p from Picture p where p.album = ?1")
    List<Picture> findByAlbum(Album album);

    //查询摄影师上传的图片并按时间排序
    @Query("select p from Picture p where p.user = ?1 order by p.comment_time desc")
    List<Picture> findByUser(User user);

}
