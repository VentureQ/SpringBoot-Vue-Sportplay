package com.wangqi.sportplay.controller;

import com.wangqi.sportplay.bean.User;
import com.wangqi.sportplay.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangqi
 * @version 1.0
 * @date 2021/10/10 14:53
 */

@RestController
public class LoginController {
    @Autowired
    UserDao userDao;

    @RequestMapping("/login")
    public String login(@RequestBody User user){
        System.out.println("user:"+user);
        String str="error";

        User count = userDao.getUserByMessage(user.getUsername(),user.getPassword());
        System.out.println("user:"+user);
        return "ok";
    }
}
