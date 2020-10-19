package com.chen.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @ProjectName:kataba
 * @author:陈慌拥
 * @date:2020/10/19 15:40
 * Description:
 */
@Data
@TableName("t_user")
public class User {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String phone;
    private String nickname;
    private String password;
    /**
     * 标记位
     * 1有效
     * 2无效
     */
    private int flag;
}