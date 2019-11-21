package com.nsw.dirs;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer album_id;

    //专辑名称
    private String album_name;

    //专辑简介
    private String album_synopsis;

    //专辑图片
    private String album_url;

    //创建时间
    private String comment_time;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private User user;

    //一对多，一个专辑有多张图片
    @OneToMany(mappedBy = "album", cascade = CascadeType.ALL)
    private Set<Picture> picture;

    public Album() {
    }

    public Integer getAlbum_id() {
        return album_id;
    }

    public void setAlbum_id(Integer album_id) {
        this.album_id = album_id;
    }

    public String getAlbum_name() {
        return album_name;
    }

    public void setAlbum_name(String album_name) {
        this.album_name = album_name;
    }

    public String getAlbum_synopsis() {
        return album_synopsis;
    }

    public void setAlbum_synopsis(String album_synopsis) {
        this.album_synopsis = album_synopsis;
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

    public String getAlbum_url() {
        return album_url;
    }

    public void setAlbum_url(String album_url) {
        this.album_url = album_url;
    }
    public Set<Picture> getPicture() {
        return picture;
    }

    public void setPicture(Set<Picture> picture) {
        this.picture = picture;
    }
}
