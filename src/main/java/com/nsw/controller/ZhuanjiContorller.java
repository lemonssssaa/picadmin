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
//        List<aaa> aaa=zuanjiService.zxsc();
//        List<aaa> jrrm=zuanjiService.jrrm();
//        List<aaa> zgll=zuanjiService.zgll();
        List<aaa> dybj=zuanjiService.dybj();
        List<aaa> wmrx=zuanjiService.wmrx();
        List<aaa> cych=zuanjiService.cych();
        List<aaa> mk=zuanjiService.mk();
        model.addAttribute("mk",mk);
        model.addAttribute("cych",cych);
//        model.addAttribute("zxsc",aaa);
//        model.addAttribute("jrrm",jrrm);
//        model.addAttribute("zgll",zgll);
        model.addAttribute("dybj",dybj);
        model.addAttribute("wmrx",wmrx);
        return "indexx";
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
        model.addAttribute("wsj",aaa);
        System.out.println(aaa);
        return "wsj";
    }

    @RequestMapping("/dm")
    public String wsj(Model model){
        List<aaa> aaa=zuanjiService.dm();
        int  b= zuanjiService.update(3);
        model.addAttribute("dm",aaa);
        System.out.println(aaa);
        return "dm";
    }
    @RequestMapping("/zlm")
    public String dm(Model model){
        List<aaa> aaa=zuanjiService.zlm();
        int  b= zuanjiService.update(4);
        model.addAttribute("zlm",aaa);
        System.out.println(aaa);
        return "zlm";
    }
    @RequestMapping("/hlj")
    public String hlj(Model model){
        List<aaa> aaa= zuanjiService.hlj();
        int  b= zuanjiService.update(5);
        model.addAttribute("hlj",aaa);
        System.out.println(aaa);
        return "hlj";
    }
    @RequestMapping("/wsjch")
    public String wsjch(Model model){
        List<aaa> aaa=zuanjiService.wsjch();
        int  b= zuanjiService.update(6);
        model.addAttribute("wsjch",aaa);
        System.out.println(aaa);
        return "wsjch";
    }

    @RequestMapping("/wgfd")
    public String wgfd(Model model){
        List<aaa> aaa=zuanjiService.wgfd();
        int  b= zuanjiService.update(7);
        model.addAttribute("wgfd",aaa);
        System.out.println(aaa);
        return "wgfd";
    }
    @RequestMapping("/wsjcb")
    public String wsjcb(Model model){
        List<aaa> aaa=zuanjiService.wsjcb();
        int  b= zuanjiService.update(8);
        model.addAttribute("wsjcb",aaa);
        System.out.println(aaa);
        return "wsjcb";
    }
    @RequestMapping("/d1")
    public String aaaa(Model model){
        List<aaa> aaa= zuanjiService.d1();
       int  b= zuanjiService.update(9);
        model.addAttribute("d1",aaa);
        System.out.println(aaa);
        return "d1";
    }
    @RequestMapping("/d2")
    public String sjj(Model model){
        List<aaa> aaa=zuanjiService.d2();
        int  b= zuanjiService.update(10);
        model.addAttribute("d2",aaa);
        System.out.println(aaa);
        return "d2";
    }

    @RequestMapping("/d3")
    public String wsjj(Model model){
        List<aaa> aaa=zuanjiService.d3();
        int  b= zuanjiService.update(11);
        model.addAttribute("d3",aaa);
        System.out.println(aaa);
        return "d3";
    }
    @RequestMapping("/d4")
    public String dmm(Model model){
        List<aaa> aaa=zuanjiService.d4();
        int  b= zuanjiService.update(12);
        model.addAttribute("d4",aaa);
        System.out.println(aaa);
        return "d4";
    }
    @RequestMapping("/d5")
    public String hljj(Model model){
        List<aaa> aaa= zuanjiService.d5();
        int  b= zuanjiService.update(13);
        model.addAttribute("d5",aaa);
        System.out.println(aaa);
        return "d5";
    }
    @RequestMapping("/d6")
    public String wsjchh(Model model){
        List<aaa> aaa=zuanjiService.d6();
        int  b= zuanjiService.update(14);
        model.addAttribute("d6",aaa);
        System.out.println(aaa);
        return "d6";
    }

    @RequestMapping("/d7")
    public String wgfdd(Model model){
        List<aaa> aaa=zuanjiService.d7();
        int  b= zuanjiService.update(15);
        model.addAttribute("d7",aaa);
        System.out.println(aaa);
        return "d7";
    }
    @RequestMapping("/d8")
    public String wsjcbb(Model model){
        List<aaa> aaa=zuanjiService.d8();
        int  b= zuanjiService.update(16);
        model.addAttribute("d8",aaa);
        System.out.println(aaa);
        return "d8";
    }
    @RequestMapping("/c1")
    public String aaaaa(Model model){
        List<aaa> aaa= zuanjiService.c1();
       int  b= zuanjiService.update(17);
        model.addAttribute("c1",aaa);
        System.out.println(aaa);
        return "c1";
    }
    @RequestMapping("/c2")
    public String sjja(Model model){
        List<aaa> aaa=zuanjiService.c2();
        int  b= zuanjiService.update(18);
        model.addAttribute("c2",aaa);
        System.out.println(aaa);
        return "c2";
    }

    @RequestMapping("/c3")
    public String wsjja(Model model){
        List<aaa> aaa=zuanjiService.c3();
        int  b= zuanjiService.update(19);
        model.addAttribute("c3",aaa);
        System.out.println(aaa);
        return "c3";
    }
    @RequestMapping("/c4")
    public String dmma(Model model){
        List<aaa> aaa=zuanjiService.c4();
        int  b= zuanjiService.update(20);
        model.addAttribute("c4",aaa);
        System.out.println(aaa);
        return "c4";
    }
    @RequestMapping("/c5")
    public String hljja(Model model){
        List<aaa> aaa= zuanjiService.c5();
        int  b= zuanjiService.update(21);
        model.addAttribute("c5",aaa);
        System.out.println(aaa);
        return "c5";
    }
    @RequestMapping("/c6")
    public String wsjchha(Model model){
        List<aaa> aaa=zuanjiService.c6();
        int  b= zuanjiService.update(22);
        model.addAttribute("c6",aaa);
        System.out.println(aaa);
        return "c6";
    }

    @RequestMapping("/c7")
    public String wgfdda(Model model){
        List<aaa> aaa=zuanjiService.c7();
        int  b= zuanjiService.update(23);
        model.addAttribute("c7",aaa);
        System.out.println(aaa);
        return "c7";
    }
    @RequestMapping("/c8")
    public String wsjcbba(Model model){
        List<aaa> aaa=zuanjiService.c8();
        int  b= zuanjiService.update(24);
        model.addAttribute("c8",aaa);
        System.out.println(aaa);
        return "c8";
    }
    @RequestMapping("/zgll")
    public String wsjcbbaa(Model model){
        List<aaa> aaa=zuanjiService.zgll();
        model.addAttribute("zgll",aaa);
        System.out.println(aaa);
        return "zgll";
    }
    @RequestMapping("/zgll2")
    public String wsjcbbaa2(Model model){
        List<aaa> aaa=zuanjiService.zgll2();
        model.addAttribute("zgll",aaa);
        System.out.println(aaa);
        return "zgll2";
    }
    @RequestMapping("/zgll3")
    public String wsjcbbaa3(Model model){
        List<aaa> aaa=zuanjiService.zgll3();
        model.addAttribute("zgll",aaa);
        System.out.println(aaa);
        return "zgll3";
    }
    @RequestMapping("/zgll4")
    public String wsjcbbaa4(Model model){
        List<aaa> aaa=zuanjiService.zgll4();
        model.addAttribute("zgll",aaa);
        System.out.println(aaa);
        return "zgll4";
    }
    @RequestMapping("/zgll5")
    public String wsjcbbaa5(Model model){
        List<aaa> aaa=zuanjiService.zgll5();
        model.addAttribute("zgll",aaa);
        System.out.println(aaa);
        return "zgll5";
    }
    @RequestMapping("/zgll6")
    public String wsjcbbaa6(Model model){
        List<aaa> aaa=zuanjiService.zgll6();
        model.addAttribute("zgll",aaa);
        System.out.println(aaa);
        return "zgll6";
    }
    @RequestMapping("/zgll7")
    public String wsjcbbaa7(Model model){
        List<aaa> aaa=zuanjiService.zgll7();
        model.addAttribute("zgll",aaa);
        System.out.println(aaa);
        return "zgll7";
    }
    @RequestMapping("/zgll8")
    public String wsjcbbaa8(Model model){
        List<aaa> aaa=zuanjiService.zgll8();
        model.addAttribute("zgll",aaa);
        System.out.println(aaa);
        return "zgll8";
    }
}
