package com.chen.util;

/**
 * @ProjectName:kataba
 * @author:陈慌拥
 * @date:2020/10/19 15:49
 * Description:
 */
public class StrUtil {

    public static boolean checkNoEmpty(String... strs) {
        boolean r = true;
        for (String s : strs) {
            if (s == null || s.length() == 0) {
                r=false;
                break;
            }
        }
        return r;
    }
}