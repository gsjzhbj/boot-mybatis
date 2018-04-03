package com.jxm.service;

import com.jxm.model.User;

import java.util.List;

/**
 * Created by gaoshja on 2018/3/30.
 */
public interface UserService {
    Object getUsers(int pageNo,int pageSize);
    Object getUserById(Integer id);
    void add(User user);

    /**
     * 用户分页列表
     * @param pageNo
     * @param pageSize
     * @return
     */
    List<User> findPageUser(int pageNo, int pageSize);

}
