package com.jxm.web;

import com.github.pagehelper.PageInfo;
import com.jxm.model.User;
import com.jxm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * Created by gaoshja on 2018/4/2.
 */
@Controller
@RequestMapping("/index")
public class IndexController {
    @Autowired
    UserService userService;
    @RequestMapping
    public String root(Model model){
        model.addAttribute("loginName","root");
        return "/index";
    }
    @RequestMapping("/reload")
    public String reload(){
        return "reload";
    }
    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("loginName","gaoshja");
        return "/index";
    }
    @RequestMapping("/helloHtml")
    public String helloHtml(Map<String,Object> map){
        map.put("hello","from TemplateController.helloHtml");
        return"/hello";
    }
    @RequestMapping("/toadd")
    public String toadd(Model model){
        User user = new User();
        user.setUserName("testUser");
        user.setPhone("18788779988");
        model.addAttribute("user",user);
        return "/add";
    }

    @RequestMapping("/list")
    public String list(@RequestParam int pageNo, @RequestParam int pageSize,Map<String, Object> map){
        List<User> users =(List<User>) userService.getUsers(pageNo,pageSize);
        PageInfo pageInfo=new PageInfo(users);
        map.put("users",users);
        map.put("page",pageInfo);
        return"/list";
    }
}
