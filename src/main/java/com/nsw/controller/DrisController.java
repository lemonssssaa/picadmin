package com.nsw.controller;

import com.alibaba.fastjson.JSONObject;
import com.nsw.dirs.Dirs;
import com.nsw.service.IDirsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("dirs")
public class DrisController {

    @Autowired
    private IDirsService iDirsService;

    @GetMapping("/delete")
    @ResponseBody
    public String delete(Integer dirs_id){
        return JSONObject.toJSONString(iDirsService.delete(dirs_id));
    }

    @GetMapping("/findAll")
    @ResponseBody
    public String findAll(){
        return JSONObject.toJSONString(iDirsService.findAll());
    }

    @GetMapping("/insert")
    @ResponseBody
    public String insert(Dirs dirs){
        return JSONObject.toJSONString(iDirsService.insert(dirs));
    }

    @GetMapping("/updata")
    @ResponseBody
    public String updata(Dirs dirs){
        return JSONObject.toJSONString(iDirsService.updata(dirs));
    }
}
