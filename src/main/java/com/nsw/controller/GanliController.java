package com.nsw.controller;


import com.nsw.mapper.GanliMapper;
import com.nsw.entity.Ganli;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class GanliController {
    @Autowired
    GanliMapper ganliMapper;

    //添加
    @RequestMapping("/addUser")
    public String listUser(Ganli ganli) throws Exception {
        ganliMapper.save(ganli);
        return "redirect:admin";
    }
    //删除
    @RequestMapping("/deleteUser")
    public String deleteUser(Ganli ganli) throws Exception {
        ganliMapper.delete(ganli.getId());
        return "redirect:admin";
    }
    //修改
    @RequestMapping("/updateUser")
    public String updateUser(Ganli ganli, @RequestParam("username") String username, @RequestParam("id") Integer id) throws Exception {
        ganli.setId(id);
        ganli.setUsername(username);
        ganliMapper.update(ganli);
        return "redirect:admin";
    }
    //查找(用于修改)
    @RequestMapping("/findUser")
    public String findUser(int id, Model model) throws Exception {
        Ganli ganli = ganliMapper.get(id);
        model.addAttribute("user", ganli);
        return "admin";
    }
    //遍历
    @RequestMapping("/admin")
    public String listUser(Model model, @RequestParam(value = "start", defaultValue = "0") int start,
                           @RequestParam(value = "size", defaultValue = "5") int size) throws Exception {
        PageHelper.startPage(start,size,"id asc");
        List<Ganli> ganliList = ganliMapper.findAll();
        PageInfo<Ganli> page = new PageInfo<>(ganliList);
        model.addAttribute("pages", page);
        return "admin";
    }
}

