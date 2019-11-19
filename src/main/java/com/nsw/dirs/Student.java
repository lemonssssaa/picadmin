package com.nsw.dirs;

import lombok.Data;
import java.io.Serializable;

/**
 * @author WengQiZhi
 * @BelongsPackage springbootday
 * @date 2019-10-29 16:56
 * @Description: todo
 */
@Data
public class Student implements Serializable {
    private static final long serialVersionUID = -9052334813852875933L;
    private Integer id;
    private String name;
    private String url;

}
