package com.chen.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.chen.dao.UserDao;
import com.chen.entity.User;
import com.chen.service.intf.UserService;
import com.chen.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName:kataba
 * @author:陈慌拥
 * @date:2020/10/19 17:19
 * Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public R<List<User>> all() {
        QueryWrapper<User> qw = new QueryWrapper<>();
        qw.orderByDesc("id");
        return R.ok(userDao.selectList(qw));
    }
}

