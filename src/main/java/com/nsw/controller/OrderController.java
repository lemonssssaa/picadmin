package com.nsw.controller;

import com.nsw.mapper.OrderMapper;
import com.nsw.entity.Order;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@Controller
//@ResponseBody

public class OrderController {
    @Autowired
    OrderMapper orderMapper;

    //添加
    @RequestMapping("/addUser")
    public String listUser(Order user)throws Exception{

        orderMapper.save(user);
        return "redirect:listUser";
    }
    //查询
    @RequestMapping("/selectUser")
    public String kindAll(Order user) throws Exception{
        orderMapper.kindAll(user);
        return "index";
    }
    //刪除
    @RequestMapping("/deleteUser")
    public String deleteUser(Order user)throws Exception{
        orderMapper.delete(user.getId());
        return "redirect:listUser";
    }
    //修改
    @RequestMapping("/updateUser")

    public String findUser(Order user)throws Exception{
        orderMapper.update(user);

        return "redirect:listUser";
    }

    @RequestMapping("/findUser")
    public String findUser(int id ,Model model)throws Exception{
    Order user = orderMapper.get(id);
    model.addAttribute("user",user);
    return "edituser";
    }
//    @ResponseBody
    @RequestMapping("/listUser")
    public String listUser(Model model, @RequestParam(value = "start", defaultValue = "0") int start,
                               @RequestParam(value = "size", defaultValue = "5") int size) throws Exception {
        PageHelper.startPage(start,size,"id asc");
        List<Order> userList=orderMapper.findAll();
        PageInfo<Order> page = new PageInfo<>(userList);
        model.addAttribute("pages", page);

        List<Order>userList2=orderMapper.FindAll();
        PageInfo<Order> Page = new PageInfo<>(userList2);
        model.addAttribute("dybj",Page);

        List<Order>userList3 = orderMapper.FindALL();
        PageInfo<Order> PAGE = new PageInfo<>(userList3);
        model.addAttribute("wmrx",PAGE);

        List<Order> userList4 = orderMapper.FIndall();
        PageInfo<Order> PAge = new PageInfo<>(userList4);
        model.addAttribute("cych",PAge);

        List<Order> userList5= orderMapper.mk();
        PageInfo<Order> PAGe = new PageInfo<>(userList5);
        model.addAttribute("mkpng",PAGe);

        return "index";
    }





}





