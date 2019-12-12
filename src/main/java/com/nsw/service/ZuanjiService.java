package com.nsw.service;

import com.nsw.dao.Zuanji;
import com.nsw.entity.aaa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZuanjiService {
    @Autowired
    private Zuanji zj;
    public List<aaa> zlm() {
        List<aaa> zlm = zj.zlm();
        return zlm;
    }
    public List<aaa> sj() {
        List<aaa> sj = zj.sj();
        return sj;
    }
    public List<aaa> wsj() {
        List<aaa> wsj = zj.wsj();
        return wsj;
    }
    public List<aaa> dm() {
        List<aaa> dm = zj.dm();
        return dm;
    }
    public List<aaa> hlj() {
        List<aaa> hlj = zj.hlj();
        return hlj;
    }
    public List<aaa> wsjch() {
        List<aaa> wsjch = zj.wsjch();
        return wsjch;
    }
    public List<aaa> wgfd() {
        List<aaa> wgfd = zj.wgfd();
        return wgfd;
    }
    public List<aaa> wsjcb() {
        List<aaa> wsjcb = zj.wsjcb();
        return wsjcb;
    }
    public List<aaa> d1() {
        List<aaa> zlm = zj.d1();
        return zlm;
    }
    public List<aaa> d2() {
        List<aaa> sj = zj.d2();
        return sj;
    }
    public List<aaa> d3() {
        List<aaa> wsj = zj.d3();
        return wsj;
    }
    public List<aaa> d4() {
        List<aaa> dm = zj.d4();
        return dm;
    }
    public List<aaa> d5() {
        List<aaa> hlj = zj.d5();
        return hlj;
    }
    public List<aaa> d6() {
        List<aaa> wsjch = zj.d6();
        return wsjch;
    }
    public List<aaa> d7() {
        List<aaa> wgfd = zj.d7();
        return wgfd;
    }
    public List<aaa> d8() {
        List<aaa> wsjcb = zj.d8();
        return wsjcb;
    }
    public List<aaa> c1() {
        List<aaa> zlm = zj.c1();
        return zlm;
    }
    public List<aaa> c2() {
        List<aaa> sj = zj.c2();
        return sj;
    }
    public List<aaa> c3() {
        List<aaa> wsj = zj.c3();
        return wsj;
    }
    public List<aaa> c4() {
        List<aaa> dm = zj.c4();
        return dm;
    }
    public List<aaa> c5() {
        List<aaa> hlj = zj.c5();
        return hlj;
    }
    public List<aaa> c6() {
        List<aaa> wsjch = zj.c6();
        return wsjch;
    }
    public List<aaa> c7() {
        List<aaa> wgfd = zj.c7();
        return wgfd;
    }
    public List<aaa> c8() {
        List<aaa> wsjcb = zj.c8();
        return wsjcb;
    }
    public List<aaa> zgll() {
        List<aaa> wsjcb = zj.zgll();
        return wsjcb;
    }
    public List<aaa> zgll2() {
        List<aaa> wsjcb = zj.zgll2();
        return wsjcb;
    }
    public List<aaa> zgll3() {
        List<aaa> wsjcb = zj.zgll3();
        return wsjcb;
    }
    public List<aaa> zgll4() {
        List<aaa> wsjcb = zj.zgll4();
        return wsjcb;
    }
    public List<aaa> zgll5() {
        List<aaa> wsjcb = zj.zgll5();
        return wsjcb;
    }
    public List<aaa> zgll6() {
        List<aaa> wsjcb = zj.zgll6();
        return wsjcb;
    }
    public List<aaa> zgll7() {
        List<aaa> wsjcb = zj.zgll7();
        return wsjcb;
    }
    public List<aaa> zgll8() {
        List<aaa> wsjcb = zj.zgll8();
        return wsjcb;
    }


    public List<aaa> dybj(){
        List<aaa> dybj=zj.dybj();
        return dybj;
    }
    public List<aaa> wmrx(){
        List<aaa> wmrx=zj.wmrx();
        return wmrx;
    }
    public List<aaa> cych(){
        List<aaa> cych=zj.cych();
        return cych;
    }
    public List<aaa> mk(){
        List<aaa> mk=zj.mk();
        return mk;
    }


    public int update(int id){
        int  a= zj.update(id);
        return a;
    }
}