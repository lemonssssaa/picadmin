package com.nsw.controller;
import com.nsw.config.MyUserDetails;
import com.nsw.dirs.*;
import com.nsw.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Controller
public class MainController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AlbumRepository albumRepository;

    @Autowired
    private PictureRepository pictureRepository;

    @Autowired
    private RelationshipRepository relationshipRepository;

    public boolean isExistUser(){
        MyUserDetails myUserDetails = (MyUserDetails) SecurityContextHolder
                .getContext().getAuthentication().getPrincipal();
        return myUserDetails.getUsername() == null ? false : true;
    }

    //获取当前User
    public User getUser(){
        MyUserDetails myUserDetails = (MyUserDetails) SecurityContextHolder
                .getContext().getAuthentication().getPrincipal();
        return userRepository.findById(myUserDetails.getUsername()).get();
    }

//    记住用户登录状态
    @ModelAttribute
    public void addUser(Model model) {
//        判断用户是否已登录
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if(!(auth instanceof AnonymousAuthenticationToken)){
            User user = getUser();
            String username = user.getUser_id();
            model.addAttribute("user", user);
            model.addAttribute("username", username);
        }
    }

    @GetMapping("/")
    public String root(){
        return "redirect:/index";
    }


    @GetMapping("/index")
    public String index(Model model){
        return "index";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/register")
    public String register(){
        return "register";
    }

    private Timestamp getCurrentTime() {
        return new Timestamp(new Date().getTime());
    }

//    @RequestMapping(value = "/relationships")
//    public String relationship(Model model, Album album) {
//        User user = getUser();
//        String user_id = user.getUser_id();
//        List<Relationship> relationship = relationshipRepository.findByFromUserId(user_id);
//        String user_ids = album.getUser().getUser_id();
//        if(!relationship.contains(user_ids)){
//            //添加关注
//            relationshipRepository.save(new Relationship(user_id, user_ids));
//        }else if (relationship.contains(user_ids)){
//            //删除关注
//            relationshipRepository.delete(new Relationship(user_id, user_ids));
//        }else{
//            return "错误！";
//        }
//        return "成功！";
//    }

    @RequestMapping("/particulars")
    public String particulars(Model model) {
        String user_id = getUser().getUser_id();
        List<Relationship> rel = relationshipRepository.findByFromUserId(user_id);
        List<User> userList = new ArrayList<User>();
        for(int i = 0; i < rel.size(); i++) {
            userList.add(userRepository.findByUser(rel.get(i).getTo_user_id()));
        }
        model.addAttribute("userList", userList);
        return "particulars";
    }

//    @RequestMapping("/user_details")
//    public String user_details(Model model, User user){
//        List<Picture> pictures = pictureRepository.findByUser(user);
//        List<Album> albums = albumRepository.findByUser(user);
//        model.addAttribute("pictures", pictures);
//        model.addAttribute("albums", albums);
//        return "user_details";
//    }


}
