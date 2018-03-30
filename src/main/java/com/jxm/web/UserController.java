package com.jxm.web;

import com.jxm.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gaoshja on 2018/3/30.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    UserService userService;

    @RequestMapping("/list")
    @ResponseBody
    public Object getUsers(){
        return userService.getUsers();
    }

    @RequestMapping("/{uid}")
    @ResponseBody
    public Object getUsers(@PathVariable("uid") Integer uid){
        logger.debug("select user by id {}.",uid);
        return userService.getUserById(uid);
    }
}
