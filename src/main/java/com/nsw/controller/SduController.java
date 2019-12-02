package com.nsw.controller;

import com.alibaba.fastjson.JSONObject;
import com.nsw.entity.Sdu;
import com.nsw.service.SdtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author WengQiZhi
 * @BelongsPackage nsw
 * @date 2019-11-29 17:16
 * @Description: todo
 */
@RestController
@RequestMapping("sdu")
public class SduController {
    @Autowired
    SdtService sdtService;

    @GetMapping("/fuzzySelect")
    public String fuzzySelect(@RequestParam("keyword") String keyword) {
        String searChe = keyword.replaceAll("%", "").replaceAll(" ", "")
                .replaceAll("_", "");
        List<Sdu> list = null;
        if (!StringUtils.isEmpty(searChe)) {
            list = sdtService.fuzzySelect(keyword);
        } else {
            list = new ArrayList<>();
        }
        return JSONObject.toJSONString(list);
    }
    @GetMapping("/selectAll")
    public String selectAll(){
        return JSONObject.toJSONString(sdtService.selectAll());
    }
}
