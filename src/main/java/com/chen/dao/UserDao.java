package com.chen.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chen.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @ProjectName:kataba
 * @author:陈慌拥
 * @date:2020/10/19 15:40
 * Description:
 */
@Repository
public interface UserDao extends BaseMapper<User> {
}