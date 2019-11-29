package com.nsw.entity;

import com.fasterxml.jackson.annotation.JsonFormat;


import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable {
    public String getPt() {
        return pt;
    }

    public void setPt(String pt) {
        this.pt = pt;
    }

    //   private int id;
//   private String name;
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
    private String pt;
    private String imagename;
    private  double imagesize;


    private String imagetime;

    private int id;
    private String name;

    public String getImagename() {
        return imagename;
    }

    public void setImagename(String imagename) {
        this.imagename = imagename;
    }

    public double getImagesize() {
        return imagesize;
    }

    public void setImagesize(double imagesize) {
        this.imagesize = imagesize;
    }



    public String getImagetime() {
        return imagetime;
    }

    public void setImagetime(String imagetime) {
        this.imagetime = imagetime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}




