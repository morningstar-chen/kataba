package com.chen.service.intf;


import com.chen.entity.User;
import com.chen.vo.R;

import java.util.List;

/**
 * @ProjectName:kataba
 * @author:陈慌拥
 * @date:2020/10/19 17:16
 * Description:
 */
public interface UserService {

    R<List<User>> all();
}

