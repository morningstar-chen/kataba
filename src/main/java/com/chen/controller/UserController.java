package com.chen.controller;

import com.chen.service.intf.UserService;
import com.chen.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName:kataba
 * @author:陈慌拥
 * @date:2020/10/19 15:36
 * Description:
 */
@RestController
@RequestMapping("/api/user/")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("all.do")
    public R all() {
        return userService.all();
    }
}