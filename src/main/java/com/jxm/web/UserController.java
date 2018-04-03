package com.jxm.web;

import com.github.pagehelper.PageHelper;
import com.jxm.model.User;
import com.jxm.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by gaoshja on 2018/3/30.
 */
@RestController
@RequestMapping("/user")
public class UserController {


    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    UserService userService;

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("loginName","admin");
        return "index";
    }
    @RequestMapping("/toadd")
    public String toadd(){
        return "/add";
    }
    @RequestMapping("/add")
    public String add(User user){
        logger.debug("add");
        userService.add(user);
        return "/add";
    }
    @RequestMapping("/list")
    @ResponseBody
    public Object getUsers(@RequestParam int pageNo,@RequestParam int pageSize){
        return userService.getUsers(pageNo,pageSize);
    }

    @RequestMapping("/{uid}")
    @ResponseBody
    public Object getUsers(@PathVariable("uid") Integer uid){
        logger.debug("select user by id {}.",uid);
        return userService.getUserById(uid);
    }
}
