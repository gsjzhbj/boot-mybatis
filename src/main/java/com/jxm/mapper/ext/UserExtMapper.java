package com.jxm.mapper.ext;

import com.jxm.mapper.UserMapper;
import com.jxm.model.User;

import java.util.List;

/**
 * Created by gaosj on 2018/3/30.
 */
public interface UserExtMapper extends UserMapper{
    List<User> selectUsers();
}
