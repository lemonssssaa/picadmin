package com.nsw.dao;

import com.nsw.entity.aaa;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
@Component
public interface Zuanji {
    @Select("SELECT url FROM shipins WHERE zhuanji =(SELECT zhuanji FROM imagelist WHERE zhuanji='霜降' LIMIT 1)")
    public List<aaa> sj();
    @Select("SELECT url FROM shipins WHERE zhuanji =(SELECT zhuanji FROM imagelist WHERE zhuanji='杂粮米' LIMIT 1)")
    public List<aaa> zlm();
    @Select("SELECT url FROM shipins WHERE zhuanji =(SELECT zhuanji FROM imagelist WHERE zhuanji='万圣节' LIMIT 1)")
    public List<aaa> wsj();
    @Select("SELECT url FROM shipins WHERE zhuanji =(SELECT zhuanji FROM imagelist WHERE zhuanji='大米' LIMIT 1)")
    public List<aaa> dm();
    @Select("SELECT url FROM shipins WHERE zhuanji =(SELECT zhuanji FROM imagelist WHERE zhuanji='红辣椒' LIMIT 1)")
    public List<aaa> hlj();
    @Select("SELECT url FROM shipins WHERE zhuanji =(SELECT zhuanji FROM imagelist WHERE zhuanji='万圣节插画' LIMIT 1)")
    public List<aaa> wsjch();
    @Select("SELECT url FROM shipins WHERE zhuanji =(SELECT zhuanji FROM imagelist WHERE zhuanji='五谷丰登' LIMIT 1)")
    public List<aaa> wgfd();
    @Select("SELECT url FROM shipins WHERE zhuanji =(SELECT zhuanji FROM imagelist WHERE zhuanji='万圣节城堡' LIMIT 1)")
    public List<aaa> wsjcb();
    @Select("SELECT url FROM shipins WHERE zhuanji =(SELECT zhuanji FROM imagelist WHERE zhuanji='d1' LIMIT 1)")
    public List<aaa> d1();
    @Select("SELECT url FROM shipins WHERE zhuanji =(SELECT zhuanji FROM imagelist WHERE zhuanji='d2' LIMIT 1)")
    public List<aaa> d2();
    @Select("SELECT url FROM shipins WHERE zhuanji =(SELECT zhuanji FROM imagelist WHERE zhuanji='d3' LIMIT 1)")
    public List<aaa> d3();
    @Select("SELECT url FROM shipins WHERE zhuanji =(SELECT zhuanji FROM imagelist WHERE zhuanji='d4' LIMIT 1)")
    public List<aaa> d4();
    @Select("SELECT url FROM shipins WHERE zhuanji =(SELECT zhuanji FROM imagelist WHERE zhuanji='d5' LIMIT 1)")
    public List<aaa> d5();
    @Select("SELECT url FROM shipins WHERE zhuanji =(SELECT zhuanji FROM imagelist WHERE zhuanji='d6' LIMIT 1)")
    public List<aaa> d6();
    @Select("SELECT url FROM shipins WHERE zhuanji =(SELECT zhuanji FROM imagelist WHERE zhuanji='d7' LIMIT 1)")
    public List<aaa> d7();
    @Select("SELECT url FROM shipins WHERE zhuanji =(SELECT zhuanji FROM imagelist WHERE zhuanji='d8' LIMIT 1)")
    public List<aaa> d8();
    @Select("SELECT url FROM shipins WHERE zhuanji =(SELECT zhuanji FROM imagelist WHERE zhuanji='c1' LIMIT 1)")
    public List<aaa> c1();
    @Select("SELECT url FROM shipins WHERE zhuanji =(SELECT zhuanji FROM imagelist WHERE zhuanji='c2' LIMIT 1)")
    public List<aaa> c2();
    @Select("SELECT url FROM shipins WHERE zhuanji =(SELECT zhuanji FROM imagelist WHERE zhuanji='c3' LIMIT 1)")
    public List<aaa> c3();
    @Select("SELECT url FROM shipins WHERE zhuanji =(SELECT zhuanji FROM imagelist WHERE zhuanji='c4' LIMIT 1)")
    public List<aaa> c4();
    @Select("SELECT url FROM shipins WHERE zhuanji =(SELECT zhuanji FROM imagelist WHERE zhuanji='c5' LIMIT 1)")
    public List<aaa> c5();
    @Select("SELECT url FROM shipins WHERE zhuanji =(SELECT zhuanji FROM imagelist WHERE zhuanji='c6' LIMIT 1)")
    public List<aaa> c6();
    @Select("SELECT url FROM shipins WHERE zhuanji =(SELECT zhuanji FROM imagelist WHERE zhuanji='c7' LIMIT 1)")
    public List<aaa> c7();
    @Select("SELECT url FROM shipins WHERE zhuanji =(SELECT zhuanji FROM imagelist WHERE zhuanji='c8' LIMIT 1)")
    public List<aaa> c8();
    @Select("SELECT url FROM shipins WHERE zhuanji=(SELECT zhuanji FROM imagelist ORDER BY browse DESC LIMIT 0,1)")
    public List<aaa> zgll();
    @Select("SELECT url FROM shipins WHERE zhuanji=(SELECT zhuanji FROM imagelist ORDER BY browse DESC LIMIT 1,1)")
    public List<aaa> zgll2();
    @Select("SELECT url FROM shipins WHERE zhuanji=(SELECT zhuanji FROM imagelist ORDER BY browse DESC LIMIT 2,1)")
    public List<aaa> zgll3();
    @Select("SELECT url FROM shipins WHERE zhuanji=(SELECT zhuanji FROM imagelist ORDER BY browse DESC LIMIT 3,1)")
    public List<aaa> zgll4();
    @Select("SELECT url FROM shipins WHERE zhuanji=(SELECT zhuanji FROM imagelist ORDER BY browse DESC LIMIT 4,1)")
    public List<aaa> zgll5();
    @Select("SELECT url FROM shipins WHERE zhuanji=(SELECT zhuanji FROM imagelist ORDER BY browse DESC LIMIT 5,1)")
    public List<aaa> zgll6();
    @Select("SELECT url FROM shipins WHERE zhuanji=(SELECT zhuanji FROM imagelist ORDER BY browse DESC LIMIT 6,1)")
    public List<aaa> zgll7();
    @Select("SELECT url FROM shipins WHERE zhuanji=(SELECT zhuanji FROM imagelist ORDER BY browse DESC LIMIT 7,1)")
    public List<aaa> zgll8();

//    @Select("SELECT url FROM shipins order by id DESC limit 8")
//    public List<aaa> zxsc();
//    @Select("SELECT url FROM shipins WHERE zhuanji =(SELECT zhuanji FROM imagelist WHERE zhuanji='今日热门' LIMIT 1)order by id DESC limit 8")
//    public List<aaa> jrrm();
//    @Select("SELECT url FROM shipins WHERE zhuanji =(SELECT zhuanji FROM imagelist WHERE zhuanji='最高浏览' LIMIT 1)")
//    public List<aaa> zgll();
    @Select("SELECT url FROM shipins WHERE zhuanji =(SELECT zhuanji FROM trable WHERE zhuanji='多元背景' LIMIT 1)")
    public List<aaa> dybj();
    @Select("SELECT url FROM shipins WHERE zhuanji =(SELECT zhuanji FROM trable WHERE zhuanji='唯美人像' LIMIT 1)")
    public List<aaa> wmrx();
    @Select("SELECT url FROM shipins WHERE zhuanji =(SELECT zhuanji FROM trable WHERE zhuanji='创意插画' LIMIT 1)")
    public List<aaa> cych();
    @Select("SELECT url FROM shipins WHERE zhuanji =(SELECT zhuanji FROM trable WHERE zhuanji='免抠png' LIMIT 1)")
    public List<aaa> mk();
    @Update("UPDATE imagelist set browse=browse+1 where id=#{id}")
    public int update(int id);

}
