package com.nsw.dirs;


import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Set;


@Entity
public class User {

    //账号
    @Id
    private  String user_id;

    //密码
    @Size(min = 6, message = "Your password must have at least 6 characters and at most 14 characters")
    private  String user_password;

    //邮箱
    @Email(message = "Please provide a valid Email!")
    @NotEmpty(message = "Email should not be empty!")
    private String email;

    //是否是VIP  0：不是  1：是
    private Integer is_grade = 0;

    //是否是摄影师  0：不是  1：是
    private Integer is_Photographer = 0;

    //用户名
    private String user_name;

    //头像
    private String user_url;

    //签名
    private String autograph;

    //一对多，一个摄影师有多个专辑
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private Set<Album> album;

    //一对多，一个摄影师有多张图片
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private Set<Picture> picture;

    public User() {//无参默认构造器
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public Integer getIs_grade() {
        return is_grade;
    }

    public void setIs_grade(Integer is_grade) {
        this.is_grade = is_grade;
    }

    public Integer getIs_Photographer() {
        return is_Photographer;
    }

    public void setIs_Photographer(Integer is_Photographer) {
        this.is_Photographer = is_Photographer;
    }

    public Set<Album> getAlbum() {
        return album;
    }

    public void setAlbum(Set<Album> album) {
        this.album = album;
    }

//    public Set<Relationship> getRelationship() {
//        return relationship;
//    }
//
//    public void setRelationship(Set<Relationship> relationship) {
//        this.relationship = relationship;
//    }

    public String getUser_url() {
        return user_url;
    }

    public void setUser_url(String user_url) {
        this.user_url = user_url;
    }

    public String getAutograph() {
        return autograph;
    }

    public void setAutograph(String autograph) {
        this.autograph = autograph;
    }
    public Set<Picture> getPicture() {
        return picture;
    }

    public void setPicture(Set<Picture> picture) {
        this.picture = picture;
    }
}

