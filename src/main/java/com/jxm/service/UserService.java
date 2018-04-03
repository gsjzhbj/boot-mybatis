package com.jxm.service;

import com.jxm.model.User;

/**
 * Created by gaoshja on 2018/3/30.
 */
public interface UserService {
    Object getUsers(int pageNo,int pageSize);
    Object getUserById(Integer id);

    void add(User user);
}
