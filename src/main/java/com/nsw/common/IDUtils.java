package com.nsw.common;

import java.util.UUID;

/**
 * @author Lizhiyuan
 * @BelongsPackage springbootstw
 * @date 2019-11-26 12:05
 * @Description: todo
 */
public class IDUtils {

    public static String getUUID() {
       return UUID.randomUUID().toString().replaceAll("-","");
    }
}
