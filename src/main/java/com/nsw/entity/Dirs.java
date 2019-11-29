package com.nsw.entity;

import lombok.Data;


import java.io.Serializable;

@Data
public class Dirs implements Serializable {


    private Integer dirs_id;

    private String dirs_name;

    private String dirs_state;

}