package com.jxm.service.impl;

import com.jxm.mapper.UserMapper;
import com.jxm.mapper.ext.UserExtMapper;
import com.jxm.model.User;
import com.jxm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by gaoshja on 2018/3/30.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserExtMapper userMapper;
    @Override
    public Object getUsers() {
        return userMapper.selectUsers();
    }
    public Object getUserById(Integer id){
        return userMapper.selectByPrimaryKey(id);
    }
    /*
    * 这个方法中用到了我们开头配置依赖的分页插件pagehelper
    * 很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
    * pageNum 开始页数
    * pageSize 每页显示的数据条数
    * */

    public List<User> findAllUser(int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
//        PageHelper.startPage(pageNum, pageSize);
        return userMapper.selectUsers();
    }
}
