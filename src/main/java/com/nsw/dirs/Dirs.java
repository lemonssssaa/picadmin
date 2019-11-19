package com.nsw.dirs;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
@Data
@Entity
public class Dirs implements Serializable {
    private static final long serialVersionUID= 6411993472351226281L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer dirs_id;

    private String dirs_name;

    private String dirs_state;

}