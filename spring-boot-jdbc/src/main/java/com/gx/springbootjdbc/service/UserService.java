package com.gx.springbootjdbc.service;


import com.gx.springbootjdbc.entity.User;

import java.util.List;
import java.util.Map;

/**
 * 用户表(TUser)表服务接口
 *
 * @author makejava
 * @since 2018-08-14 13:19:49
 */
public interface UserService {

    public List<User> getUserList();

    public User getUser(Long id);

    public int delUser(Long id);

    public int addUser(User user);

    public int editUser(Long id, User user);

}