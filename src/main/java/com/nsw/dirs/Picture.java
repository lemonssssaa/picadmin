package com.nsw.dirs;

import javax.persistence.*;

@Entity
public class Picture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer picture_id;

    //图片名称
    private String picture_name;

    //图片简介
    private String picture_synopsis;

    //图片地址
    private String picture_url;

    //上传时间
    private String comment_time;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "album_id", referencedColumnName = "album_id")
    private Album album;

    public Picture() {
    }

    public Integer getPicture_id() {
        return picture_id;
    }

    public void setPicture_id(Integer picture_id) {
        this.picture_id = picture_id;
    }

    public String getPicture_name() {
        return picture_name;
    }

    public void setPicture_name(String picture_name) {
        this.picture_name = picture_name;
    }

    public String getPicture_synopsis() {
        return picture_synopsis;
    }

    public void setPicture_synopsis(String picture_synopsis) {
        this.picture_synopsis = picture_synopsis;
    }

    public String getPicture_url() {
        return picture_url;
    }

    public void setPicture_url(String picture_url) {
        this.picture_url = picture_url;
    }

    public String getComment_time() {
        return comment_time;
    }

    public void setComment_time(String comment_time) {
        this.comment_time = comment_time;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
}
