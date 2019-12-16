package com.nsw.controller;

import com.nsw.entity.aaa;
import com.nsw.service.ZuanjiService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ZhuanjiContorller {
    @Autowired
    private ZuanjiService zuanjiService;
    @RequestMapping("/a")
    public String indexx(Model model){
        List<aaa> dybj=zuanjiService.dybj();
        List<aaa> wmrx=zuanjiService.wmrx();
        List<aaa> cych=zuanjiService.cych();
        List<aaa> mk=zuanjiService.mk();
        model.addAttribute("mk",mk);
        model.addAttribute("cych",cych);
        model.addAttribute("dybj",dybj);
        model.addAttribute("wmrx",wmrx);
        return "index";
    }
    @RequestMapping("/sj")
    public String aaa(Model model){
        List<aaa> aaa= zuanjiService.sj();
        int  b= zuanjiService.update(1);
        model.addAttribute("sj",aaa);
        System.out.println(aaa);
        return "sj";
    }
    @RequestMapping("/wsj")
    public String sj(Model model){
        List<aaa> aaa=zuanjiService.wsj();
        int  b= zuanjiService.update(2);
        model.addAttribute("sj",aaa);
        System.out.println(aaa);
        return "sj";
    }

    @RequestMapping("/dm")
    public String wsj(Model model){
        List<aaa> aaa=zuanjiService.dm();
        int  b= zuanjiService.update(3);
        model.addAttribute("sj",aaa);
        System.out.println(aaa);
        return "sj";
    }
    @RequestMapping("/zlm")
    public String dm(Model model){
        List<aaa> aaa=zuanjiService.zlm();
        int  b= zuanjiService.update(4);
        model.addAttribute("sj",aaa);
        System.out.println(aaa);
        return "sj";
    }
    @RequestMapping("/hlj")
    public String hlj(Model model){
        List<aaa> aaa= zuanjiService.hlj();
        int  b= zuanjiService.update(5);
        model.addAttribute("sj",aaa);
        System.out.println(aaa);
        return "sj";
    }
    @RequestMapping("/wsjch")
    public String wsjch(Model model){
        List<aaa> aaa=zuanjiService.wsjch();
        int  b= zuanjiService.update(6);
        model.addAttribute("sj",aaa);
        System.out.println(aaa);
        return "sj";
    }

    @RequestMapping("/wgfd")
    public String wgfd(Model model){
        List<aaa> aaa=zuanjiService.wgfd();
        int  b= zuanjiService.update(7);
        model.addAttribute("sj",aaa);
        System.out.println(aaa);
        return "sj";
    }
    @RequestMapping("/wsjcb")
    public String wsjcb(Model model){
        List<aaa> aaa=zuanjiService.wsjcb();
        int  b= zuanjiService.update(8);
        model.addAttribute("sj",aaa);
        System.out.println(aaa);
        return "sj";
    }
    @RequestMapping("/d1")
    public String aaaa(Model model){
        List<aaa> aaa= zuanjiService.d1();
        int  b= zuanjiService.update(9);
        model.addAttribute("sj",aaa);
        System.out.println(aaa);
        return "sj";
    }
    @RequestMapping("/d2")
    public String sjj(Model model){
        List<aaa> aaa=zuanjiService.d2();
        int  b= zuanjiService.update(10);
        model.addAttribute("sj",aaa);
        System.out.println(aaa);
        return "sj";
    }

    @RequestMapping("/d3")
    public String wsjj(Model model){
        List<aaa> aaa=zuanjiService.d3();
        int  b= zuanjiService.update(11);
        model.addAttribute("sj",aaa);
        System.out.println(aaa);
        return "sj";
    }
    @RequestMapping("/d4")
    public String dmm(Model model){
        List<aaa> aaa=zuanjiService.d4();
        int  b= zuanjiService.update(12);
        model.addAttribute("sj",aaa);
        System.out.println(aaa);
        return "sj";
    }
    @RequestMapping("/d5")
    public String hljj(Model model){
        List<aaa> aaa= zuanjiService.d5();
        int  b= zuanjiService.update(13);
        model.addAttribute("sj",aaa);
        System.out.println(aaa);
        return "sj";
    }
    @RequestMapping("/d6")
    public String wsjchh(Model model){
        List<aaa> aaa=zuanjiService.d6();
        int  b= zuanjiService.update(14);
        model.addAttribute("sj",aaa);
        System.out.println(aaa);
        return "sj";
    }

    @RequestMapping("/d7")
    public String wgfdd(Model model){
        List<aaa> aaa=zuanjiService.d7();
        int  b= zuanjiService.update(15);
        model.addAttribute("sj",aaa);
        System.out.println(aaa);
        return "sj";
    }
    @RequestMapping("/d8")
    public String wsjcbb(Model model){
        List<aaa> aaa=zuanjiService.d8();
        int  b= zuanjiService.update(16);
        model.addAttribute("sj",aaa);
        System.out.println(aaa);
        return "sj";
    }
    @RequestMapping("/c1")
    public String aaaaa(Model model){
        List<aaa> aaa= zuanjiService.c1();
        int  b= zuanjiService.update(17);
        model.addAttribute("sj",aaa);
        System.out.println(aaa);
        return "sj";
    }
    @RequestMapping("/c2")
    public String sjja(Model model){
        List<aaa> aaa=zuanjiService.c2();
        int  b= zuanjiService.update(18);
        model.addAttribute("sj",aaa);
        System.out.println(aaa);
        return "sj";
    }

    @RequestMapping("/c3")
    public String wsjja(Model model){
        List<aaa> aaa=zuanjiService.c3();
        int  b= zuanjiService.update(19);
        model.addAttribute("sj",aaa);
        System.out.println(aaa);
        return "sj";
    }
    @RequestMapping("/c4")
    public String dmma(Model model){
        List<aaa> aaa=zuanjiService.c4();
        int  b= zuanjiService.update(20);
        model.addAttribute("sj",aaa);
        System.out.println(aaa);
        return "sj";
    }
    @RequestMapping("/c5")
    public String hljja(Model model){
        List<aaa> aaa= zuanjiService.c5();
        int  b= zuanjiService.update(21);
        model.addAttribute("sj",aaa);
        System.out.println(aaa);
        return "sj";
    }
    @RequestMapping("/c6")
    public String wsjchha(Model model){
        List<aaa> aaa=zuanjiService.c6();
        int  b= zuanjiService.update(22);
        model.addAttribute("sj",aaa);
        System.out.println(aaa);
        return "sj";
    }

    @RequestMapping("/c7")
    public String wgfdda(Model model){
        List<aaa> aaa=zuanjiService.c7();
        int  b= zuanjiService.update(23);
        model.addAttribute("sj",aaa);
        System.out.println(aaa);
        return "sj";
    }
    @RequestMapping("/c8")
    public String wsjcbba(Model model){
        List<aaa> aaa=zuanjiService.c8();
        int  b= zuanjiService.update(24);
        model.addAttribute("sj",aaa);
        System.out.println(aaa);
        return "sj";
    }
    @RequestMapping("/zgll")
    public String wsjcbbaa(Model model){
        List<aaa> aaa=zuanjiService.zgll();
        model.addAttribute("sj",aaa);
        System.out.println(aaa);
        return "sj";
    }
    @RequestMapping("/zgll2")
    public String wsjcbbaa2(Model model){
        List<aaa> aaa=zuanjiService.zgll2();
        model.addAttribute("sj",aaa);
        System.out.println(aaa);
        return "sj";
    }
    @RequestMapping("/zgll3")
    public String wsjcbbaa3(Model model){
        List<aaa> aaa=zuanjiService.zgll3();
        model.addAttribute("sj",aaa);
        System.out.println(aaa);
        return "sj";
    }
    @RequestMapping("/zgll4")
    public String wsjcbbaa4(Model model){
        List<aaa> aaa=zuanjiService.zgll4();
        model.addAttribute("sj",aaa);
        System.out.println(aaa);
        return "sj";
    }
    @RequestMapping("/zgll5")
    public String wsjcbbaa5(Model model){
        List<aaa> aaa=zuanjiService.zgll5();
        model.addAttribute("sj",aaa);
        System.out.println(aaa);
        return "sj";
    }
    @RequestMapping("/zgll6")
    public String wsjcbbaa6(Model model){
        List<aaa> aaa=zuanjiService.zgll6();
        model.addAttribute("sj",aaa);
        System.out.println(aaa);
        return "sj";
    }
    @RequestMapping("/zgll7")
    public String wsjcbbaa7(Model model){
        List<aaa> aaa=zuanjiService.zgll7();
        model.addAttribute("sj",aaa);
        System.out.println(aaa);
        return "sj";
    }
    @RequestMapping("/zgll8")
    public String wsjcbbaa8(Model model){
        List<aaa> aaa=zuanjiService.zgll8();
        model.addAttribute("sj",aaa);
        System.out.println(aaa);
        return "sj";
    }
}
