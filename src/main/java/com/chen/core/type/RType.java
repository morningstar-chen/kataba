package com.chen.core.type;

/**
 * @ProjectName:kataba
 * @author:陈慌拥
 * @date:2020/10/19 15:36
 * Description:
 */
public enum RType {

    成功(1),失败(2), 登录失败(3);

    private int val;

    public int getVal() {
        return val;
    }

    private RType(int val) {
        this.val = val;
    }
}
